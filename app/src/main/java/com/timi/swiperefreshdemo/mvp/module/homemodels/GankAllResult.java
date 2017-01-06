package com.timi.swiperefreshdemo.mvp.module.homemodels;

import java.util.List;

/**
 * Created by timi on 2017/1/6.
 * to do:  全部的返回
 */

public class GankAllResult {

    /**
     * error : false
     * results : [{"_id":"58632da3421aa94db821c254","createdAt":"2016-12-28T11:12:35.806Z","desc":"iOS Runtime之五：方法与消息","images":["http://img.gank.io/0d3249e5-512f-4171-89e9-f17465edff14"],"publishedAt":"2017-01-06T13:20:19.591Z","source":"chrome","type":"iOS","url":"http://www.imlifengfeng.com/blog/?p=398&come=gank","used":true,"who":"feng"},{"_id":"58632dbb421aa94dbe2ccd9c","createdAt":"2016-12-28T11:12:59.602Z","desc":"iOS Runtime之六：Method Swizzling","publishedAt":"2017-01-06T13:20:19.591Z","source":"chrome","type":"iOS","url":"http://www.imlifengfeng.com/blog/?p=400","used":true,"who":"feng"},{"_id":"586dd4ed421aa9316407fb5c","createdAt":"2017-01-05T13:09:01.289Z","desc":"ITCoder WeeklyBlog 第八期","publishedAt":"2017-01-06T13:20:19.591Z","source":"web","type":"拓展资源","url":"http://itscoder.com/weeklyblog-phase-8/","used":true,"who":null},{"_id":"586ddc96421aa9316407fb5e","createdAt":"2017-01-05T13:41:42.513Z","desc":"贝塞尔Loading\u2014\u2014化学风暴","publishedAt":"2017-01-06T13:20:19.591Z","source":"web","type":"Android","url":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=2649485066&idx=1&sn=6f9e3b2fc27835aa3cdf8d88103383d9&chksm=83f8260ab48faf1cbf90aa0e174ed7c0522b887fc9c0f1becb221b701d7e317dca572069ecbb#rd","used":true,"who":"xuyisheng"},{"_id":"586e1aad421aa9315ea79905","createdAt":"2017-01-05T18:06:37.810Z","desc":"1-5","publishedAt":"2017-01-06T13:20:19.591Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034gw1fbfwwsjh3zj20u00u00w1.jpg","used":true,"who":"daimajia"},{"_id":"586e2f4c421aa93161103da7","createdAt":"2017-01-05T19:34:36.54Z","desc":"仿小红书图片标签","images":["http://img.gank.io/e353b213-cfb8-4dd1-9f02-4cb757f0c449"],"publishedAt":"2017-01-06T13:20:19.591Z","source":"web","type":"Android","url":"https://github.com/shellljx/TagViewGroup","used":true,"who":"li jinxiang"},{"_id":"586e5e31421aa9316407fb62","createdAt":"2017-01-05T22:54:41.373Z","desc":"某熊周刊:一周推荐外文技术资料（1.1）","publishedAt":"2017-01-06T13:20:19.591Z","source":"chrome","type":"瞎推荐","url":"https://zhuanlan.zhihu.com/p/24739573","used":true,"who":"王下邀月熊"},{"_id":"586e6400421aa9316407fb64","createdAt":"2017-01-05T23:19:28.548Z","desc":"vue插件-简洁好用的markdown编辑器","publishedAt":"2017-01-06T13:20:19.591Z","source":"web","type":"前端","url":"https://github.com/F-loat/vue-simplemde","used":true,"who":"柴茂源"},{"_id":"586ef725421aa9315ea79907","createdAt":"2017-01-06T09:47:17.539Z","desc":"首富马云小品首秀，搭档宋小宝却当面把首富们都损了一遍","publishedAt":"2017-01-06T13:20:19.591Z","source":"chrome","type":"休息视频","url":"http://www.toutiao.com/i6372124630777332226/?tt_from=weixin&utm_campaign=client_share&app=news_article&utm_source=weixin&iid=7132594338&utm_medium=toutiao_android&wxshare_count=1","used":true,"who":"daimajia"},{"_id":"586f0566421aa9315bfbe827","createdAt":"2017-01-06T10:48:06.166Z","desc":"一键接入Tinker","publishedAt":"2017-01-06T13:20:19.591Z","source":"web","type":"Android","url":"http://w4lle.github.io/2017/01/05/one-key-for-tinker/","used":true,"who":"王令龙"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 58632da3421aa94db821c254
         * createdAt : 2016-12-28T11:12:35.806Z
         * desc : iOS Runtime之五：方法与消息
         * images : ["http://img.gank.io/0d3249e5-512f-4171-89e9-f17465edff14"]
         * publishedAt : 2017-01-06T13:20:19.591Z
         * source : chrome
         * type : iOS
         * url : http://www.imlifengfeng.com/blog/?p=398&come=gank
         * used : true
         * who : feng
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;
        private List<String> images;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }
}
