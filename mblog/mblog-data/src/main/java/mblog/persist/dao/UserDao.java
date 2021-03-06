/*
+--------------------------------------------------------------------------
|   Mblog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package mblog.persist.dao;

import mblog.persist.entity.UserPO;
import mtons.modules.persist.BaseRepository;
import mtons.modules.pojos.Paging;

import java.util.List;
import java.util.Set;

/**
 * @author langhsu
 */
public interface UserDao extends BaseRepository<UserPO> {
    UserPO getByUsername(String username);

    UserPO getByEmail(String email);

    List<UserPO> paging(Paging paging, String key);

    List<UserPO> findByIds(Set<Long> ids);

    void identityPost(List<Long> userIds, boolean identity);

    void identityComment(List<Long> userIds, boolean identity);

    void identityFollow(List<Long> userIds, boolean identity);

    void identityFans(List<Long> userIds, boolean identity);

    void identityFavors(List<Long> userIds, boolean identity);
}
