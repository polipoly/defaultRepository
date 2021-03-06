/*
+--------------------------------------------------------------------------
|   Mblog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/
package mblog.persist.service;

import java.util.List;

/**
 * @author langhsu on 2015/8/6.
 */
public interface UserEventService {
    /**
     * 自增发布文章数
     * @param userId
     * @param postId
     */
    void identityPost(List<Long> userId, long postId, boolean identity);

    /**
     * 自增评论数
     * @param userId
     * @param commentId
     */
    void identityComment(List<Long> userId, long commentId, boolean identity);

    /**
     * 自增关注数
     * @param userId
     * @param followId
     */
    void identityFollow(List<Long> userId, long followId, boolean identity);

    /**
     * 自增粉丝数
     * @param userId
     * @param fansId
     */
    void identityFans(List<Long> userId, long fansId, boolean identity);

    /**
     * 自增收藏数
     * @param userId
     * @param targetType
     * @param targetId
     */
    void identityFavors(List<Long> userId, boolean identity, int targetType, long targetId);
}
