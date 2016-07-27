package com.liudekun.player.bean;

import java.util.List;

/**
 * 德坤应用的Entity
 * Created by Administrator on 2016/7/21.
 */
public class PassportLoginResult {
    /**
     * id : 5790582f1f00003000ccf859
     * type : photo
     * user : {"id":"578f63b81c00001000cf35ee","nickname":"抹茶味空太","avatar":"http://img.playalot.cn/user/photo/205A_1469077251_w_160_h_160_578f63b81c00001000cf35ee.jpg?imageView2/2/w/180/q/85","cover":"http://img.playalot.cn/user/photo/B885_1469077251_w_1920_h_989_578f63b81c00001000cf35ee.jpg?imageView2/2/w/1080/q/85","bio":"没啥钱的学生党","gender":"f","level":0,"approval":null}
     * photos : [{"url":"http://img.playalot.cn/user/photo/3A2E_1469077548_w_1080_h_720_578f63b81c00001000cf35ee.jpg?imageView2/2/w/1080/q/85","tags":[]},{"url":"http://img.playalot.cn/user/photo/D7CA_1469077549_w_1080_h_720_578f63b81c00001000cf35ee.jpg?imageView2/2/w/1080/q/85","tags":[]},{"url":"http://img.playalot.cn/user/photo/33C0_1469077550_w_1080_h_720_578f63b81c00001000cf35ee.jpg?imageView2/2/w/1080/q/85","tags":[]},{"url":"http://img.playalot.cn/user/photo/C087_1469077550_w_1080_h_720_578f63b81c00001000cf35ee.jpg?imageView2/2/w/1080/q/85","tags":[]}]
     * tags : [{"id":"5677f0315d32257b02c5473c","text":"悠哉日常大王","type":null}]
     * totalLikes : 1
     * caption : GSC 喵帕斯
     * totalComments : 1
     * created : 1469077551873
     */

    private List<PostsBean> posts;
    /**
     * value : 玩具控
     * count : 641
     */

    private List<TagsBean> tags;
    /**
     * id : 572ddb130100000100a0a99d
     * name : 请问您今天要来点兔子吗？？ 智乃&提比&豆馅&Wild Geese
     * cover : http://img.playalot.cn/sku/cover/572ddb130100000100a0a99d.jpg?imageView2/2/w/320/q/85
     * company : Stronger
     * release : 2017年1月
     * money : 12,800日元
     * counts : {"hits":84,"wish":6,"owns":0,"scores":0}
     * images : []
     */

    private List<NewToysBean> newToys;
    /**
     * id : 569784b701000001002941e4
     * name : IS 〈Infinite Stratos〉 蓝色之泪 塞西莉亚
     * cover : http://img.playalot.cn/sku/cover/569784b701000001002941e4.jpg?imageView2/2/w/320/q/85
     * company : AmiAmi
     * release : 2016年7月
     * money : 29,700日元
     * counts : {"hits":249,"wish":7,"owns":0,"scores":0}
     * images : []
     */

    private List<ReleaseToysBean> releaseToys;
    /**
     * id : 5732c4f40100000100bd8d02
     * name : METAL BUILD 命运高达（海涅机）
     * cover : http://img.playalot.cn/sku/cover/5732c4f40100000100bd8d02.jpg?imageView2/2/w/320/q/85
     * company : 万代
     * release : 2016年4月25日
     * money : 19,000日元
     * counts : {"hits":929,"wish":38,"owns":31,"scores":1}
     * images : []
     */

    private List<HotToysBean> hotToys;

    public List<PostsBean> getPosts() {
        return posts;
    }

    public void setPosts(List<PostsBean> posts) {
        this.posts = posts;
    }

    public List<TagsBean> getTags() {
        return tags;
    }

    public void setTags(List<TagsBean> tags) {
        this.tags = tags;
    }

    public List<NewToysBean> getNewToys() {
        return newToys;
    }

    public void setNewToys(List<NewToysBean> newToys) {
        this.newToys = newToys;
    }

    public List<ReleaseToysBean> getReleaseToys() {
        return releaseToys;
    }

    public void setReleaseToys(List<ReleaseToysBean> releaseToys) {
        this.releaseToys = releaseToys;
    }

    public List<HotToysBean> getHotToys() {
        return hotToys;
    }

    public void setHotToys(List<HotToysBean> hotToys) {
        this.hotToys = hotToys;
    }

    public static class PostsBean {
        private String id;
        private String type;
        /**
         * id : 578f63b81c00001000cf35ee
         * nickname : 抹茶味空太
         * avatar : http://img.playalot.cn/user/photo/205A_1469077251_w_160_h_160_578f63b81c00001000cf35ee.jpg?imageView2/2/w/180/q/85
         * cover : http://img.playalot.cn/user/photo/B885_1469077251_w_1920_h_989_578f63b81c00001000cf35ee.jpg?imageView2/2/w/1080/q/85
         * bio : 没啥钱的学生党
         * gender : f
         * level : 0
         * approval : null
         */

        private UserBean user;
        private int totalLikes;
        private String caption;
        private int totalComments;
        private long created;
        /**
         * url : http://img.playalot.cn/user/photo/3A2E_1469077548_w_1080_h_720_578f63b81c00001000cf35ee.jpg?imageView2/2/w/1080/q/85
         * tags : []
         */

        private List<PhotosBean> photos;
        /**
         * id : 5677f0315d32257b02c5473c
         * text : 悠哉日常大王
         * type : null
         */

        private List<TagsBean> tags;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public int getTotalLikes() {
            return totalLikes;
        }

        public void setTotalLikes(int totalLikes) {
            this.totalLikes = totalLikes;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public int getTotalComments() {
            return totalComments;
        }

        public void setTotalComments(int totalComments) {
            this.totalComments = totalComments;
        }

        public long getCreated() {
            return created;
        }

        public void setCreated(long created) {
            this.created = created;
        }

        public List<PhotosBean> getPhotos() {
            return photos;
        }

        public void setPhotos(List<PhotosBean> photos) {
            this.photos = photos;
        }

        public List<TagsBean> getTags() {
            return tags;
        }

        public void setTags(List<TagsBean> tags) {
            this.tags = tags;
        }

        public static class UserBean {
            private String id;
            private String nickname;
            private String avatar;
            private String cover;
            private String bio;
            private String gender;
            private int level;
            private Object approval;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getBio() {
                return bio;
            }

            public void setBio(String bio) {
                this.bio = bio;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public Object getApproval() {
                return approval;
            }

            public void setApproval(Object approval) {
                this.approval = approval;
            }
        }

        public static class PhotosBean {
            private String url;
            private List<?> tags;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }

        public static class TagsBean {
            private String id;
            private String text;
            private Object type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }

            public Object getType() {
                return type;
            }

            public void setType(Object type) {
                this.type = type;
            }
        }
    }

    public static class TagsBean {
        private String value;
        private int count;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    public static class NewToysBean {
        private String id;
        private String name;
        private String cover;
        private String company;
        private String release;
        private String money;
        /**
         * hits : 84
         * wish : 6
         * owns : 0
         * scores : 0
         */

        private CountsBean counts;
        private List<?> images;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getRelease() {
            return release;
        }

        public void setRelease(String release) {
            this.release = release;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public CountsBean getCounts() {
            return counts;
        }

        public void setCounts(CountsBean counts) {
            this.counts = counts;
        }

        public List<?> getImages() {
            return images;
        }

        public void setImages(List<?> images) {
            this.images = images;
        }

        public static class CountsBean {
            private int hits;
            private int wish;
            private int owns;
            private int scores;

            public int getHits() {
                return hits;
            }

            public void setHits(int hits) {
                this.hits = hits;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public int getOwns() {
                return owns;
            }

            public void setOwns(int owns) {
                this.owns = owns;
            }

            public int getScores() {
                return scores;
            }

            public void setScores(int scores) {
                this.scores = scores;
            }
        }
    }

    public static class ReleaseToysBean {
        private String id;
        private String name;
        private String cover;
        private String company;
        private String release;
        private String money;
        /**
         * hits : 249
         * wish : 7
         * owns : 0
         * scores : 0
         */

        private CountsBean counts;
        private List<?> images;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getRelease() {
            return release;
        }

        public void setRelease(String release) {
            this.release = release;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public CountsBean getCounts() {
            return counts;
        }

        public void setCounts(CountsBean counts) {
            this.counts = counts;
        }

        public List<?> getImages() {
            return images;
        }

        public void setImages(List<?> images) {
            this.images = images;
        }

        public static class CountsBean {
            private int hits;
            private int wish;
            private int owns;
            private int scores;

            public int getHits() {
                return hits;
            }

            public void setHits(int hits) {
                this.hits = hits;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public int getOwns() {
                return owns;
            }

            public void setOwns(int owns) {
                this.owns = owns;
            }

            public int getScores() {
                return scores;
            }

            public void setScores(int scores) {
                this.scores = scores;
            }
        }
    }

    public static class HotToysBean {
        private String id;
        private String name;
        private String cover;
        private String company;
        private String release;
        private String money;
        /**
         * hits : 929
         * wish : 38
         * owns : 31
         * scores : 1
         */

        private CountsBean counts;
        private List<?> images;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCover() {
            return cover;
        }

        public void setCover(String cover) {
            this.cover = cover;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getRelease() {
            return release;
        }

        public void setRelease(String release) {
            this.release = release;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public CountsBean getCounts() {
            return counts;
        }

        public void setCounts(CountsBean counts) {
            this.counts = counts;
        }

        public List<?> getImages() {
            return images;
        }

        public void setImages(List<?> images) {
            this.images = images;
        }

        public static class CountsBean {
            private int hits;
            private int wish;
            private int owns;
            private int scores;

            public int getHits() {
                return hits;
            }

            public void setHits(int hits) {
                this.hits = hits;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public int getOwns() {
                return owns;
            }

            public void setOwns(int owns) {
                this.owns = owns;
            }

            public int getScores() {
                return scores;
            }

            public void setScores(int scores) {
                this.scores = scores;
            }
        }
    }
}
