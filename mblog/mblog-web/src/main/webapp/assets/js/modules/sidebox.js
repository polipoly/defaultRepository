/*
+--------------------------------------------------------------------------
|   Mblog [#RELEASE_VERSION#]
|   ========================================
|   Copyright (c) 2014, 2015 mtons. All Rights Reserved
|   http://www.mtons.com
|
+---------------------------------------------------------------------------
*/

/**
 * 侧边栏
 */
define(function(require, exports, module) {
	J = jQuery;
	require('plugins');
	
	var Sidebox = {
        init : function (options) {
        	this.options = $.extend({}, this.defaults, options);
        },
        defaults: {
			latestUrl : '',
        	hotUrl : '',
			hotTagUrl : '',
        	maxResults :6,
            // callback
            onLoadLatest : function (i, data) {},
            onLoadHot : function (i, data) {}
        },
        
        onLoad : function () {
        	var opts = this.options;
			var that = this;

			// 手机端跳过加载侧边栏
			if(mblog && (mblog.browser.ios || mblog.browser.android)) {
				return false;
			}
        	// load hots
			if (opts.hotUrl) {

				J.ajax( {
					url: opts.hotUrl,
					data: {maxResults : opts.maxResults},
					cache : true,
					success: function (ret) {
						$('#hots').empty();
						if(ret && ret.length > 0){
							jQuery.each(ret, function(i, n) {
								var item = opts.onLoadHot.call(that, i, n);
								$('#hots').append(item);
							});
						} else {
							$('#hots').append('<li class="cat-item cat-item-6"><span>沒有相关记录</span></li>');
						}
					}
				} );
			}

			if (opts.latestUrl) {
				J.ajax( {
					url: opts.latestUrl,
					data: {maxResults : opts.maxResults},
					cache : true,
					success: function (ret) {
						$('#latests').empty();
						if (ret && ret.length > 0) {
							jQuery.each(ret, function (i, n) {
								var item = opts.onLoadLatest.call(that, i, n);
								$('#latests').append(item);
							});
						} else {
							$('#latests').append('<li class="cat-item cat-item-6"><span>沒有相关记录</span></li>');
						}
					}
				} );
			}

			if (opts.hotTagUrl) {
				J.ajax( {
					url: opts.hotTagUrl,
					data: {maxResults : opts.maxResults},
					cache : true,
					success: function (ret) {
						$('#hottags').empty();
						if (ret && ret.length > 0) {
							jQuery.each(ret, function (i, n) {
								var item = opts.onLoadHotTag.call(that, i, n);
								$('#hottags').append(item);
							});
						} else {
							$('#hottags').append('<li class="cat-item cat-item-6"><span>沒有相关记录</span></li>');
						}
					}
				} );
			}
        }
    };
	
	exports.init = function (opts) {
		Sidebox.init(opts);
		Sidebox.onLoad();
	}
	
});