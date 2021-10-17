package net.sunofbeach.taobao.beans;

import java.util.List;

public class SearchResult {


    private TbkDgMaterialOptionalResponseBean tbk_dg_material_optional_response;

    public TbkDgMaterialOptionalResponseBean getTbk_dg_material_optional_response() {
        return tbk_dg_material_optional_response;
    }

    public void setTbk_dg_material_optional_response(TbkDgMaterialOptionalResponseBean tbk_dg_material_optional_response) {
        this.tbk_dg_material_optional_response = tbk_dg_material_optional_response;
    }

    public static class TbkDgMaterialOptionalResponseBean {

        private ResultListBean result_list;
        private long total_results;
        private String request_id;

        public ResultListBean getResult_list() {
            return result_list;
        }

        public void setResult_list(ResultListBean result_list) {
            this.result_list = result_list;
        }

        public long getTotal_results() {
            return total_results;
        }

        public void setTotal_results(long total_results) {
            this.total_results = total_results;
        }

        public String getRequest_id() {
            return request_id;
        }

        public void setRequest_id(String request_id) {
            this.request_id = request_id;
        }

        public static class ResultListBean {
            private List<MapDataBean> map_data;

            public List<MapDataBean> getMap_data() {
                return map_data;
            }

            public void setMap_data(List<MapDataBean> map_data) {
                this.map_data = map_data;
            }

            public static class MapDataBean {
                /**
                 * category_id : 50000852
                 * category_name : 中老年女装
                 * commission_rate : 300
                 * commission_type : MKT
                 * coupon_amount : 3
                 * coupon_end_time : 2019-10-26
                 * coupon_id : a8c26fb47b214f3a82495d9bd566ee05
                 * coupon_info : 满58.00元减3元
                 * coupon_remain_count : 8378
                 * coupon_share_url : //uland.taobao.com/coupon/edetail?e=0a2i49NgFHMNfLV8niU3RwXoB%2BDaBK5LQS0Flu%2FfbSp4QsdWMikAalrisGmre1Id522H2TxuqpKBaUiPPZbI5qK6e2m37yV7nXTi95x%2F5EnCIALRMrUzmckbkW%2BkBhM2q2rZP7lt5W1ZLSj1nOXTTgH%2FlwNDrBX3bNt8v1hgCr6yFSCjprLTnl21qgtcIlJ5ZfsyVCABQQvL5bwjDdgCQXCshnSxXxfjTTiZb6qxNoeie%2FpBy9wBFg%3D%3D&&app_pvid=59590_11.132.118.97_471_1571384288318&ptl=floorId:2836;app_pvid:59590_11.132.118.97_471_1571384288318;tpp_pvid:100_11.178.152.29_56668_3151571384288323416&xId=wm6j8egf2ll49M1iOAFxKwwIVcjbXJa5NeK7C5qc0r4m8v12wC3pSAfQZbaYT8AwwVaCk5s9yBcMwqjJx3HQUo&union_lens=lensId%3A0b847661_0df1_16dddcd64d2_ab83
                 * coupon_start_fee : 58.00
                 * coupon_start_time : 2019-08-27
                 * coupon_total_count : 10000
                 * include_dxjh : false
                 * include_mkt : true
                 * info_dxjh : {}
                 * item_description : 七分袖衬衫
                 * item_id : 575565417288
                 * item_url : https://detail.tmall.com/item.htm?id=575565417288
                 * level_one_category_id : 16
                 * level_one_category_name : 女装/女士精品
                 * nick : 新以利法旗舰店
                 * num_iid : 575565417288
                 * pict_url : https://img.alicdn.com/bao/uploaded/i3/2057565955/O1CN01fDgQfL1trR6PNbdYW_!!0-item_pic.jpg
                 * presale_deposit : 0
                 * presale_end_time : 0
                 * presale_start_time : 0
                 * presale_tail_end_time : 0
                 * presale_tail_start_time : 0
                 * provcity : 上海
                 * real_post_fee : 0.00
                 * reserve_price : 169
                 * seller_id : 2057565955
                 * shop_dsr : 48017
                 * shop_title : 新以利法旗舰店
                 * short_title : 妈妈春夏中袖中老年春秋装方领衬衫
                 * small_images : {"string":["https://img.alicdn.com/i2/2057565955/TB2UL89pcUrBKNjSZPxXXX00pXa_!!2057565955-0-item_pic.jpg","https://img.alicdn.com/i3/2057565955/TB2r.NbpyMnBKNjSZFzXXc_qVXa_!!2057565955.jpg","https://img.alicdn.com/i2/2057565955/TB2KDkspborBKNjSZFjXXc_SpXa_!!2057565955.jpg","https://img.alicdn.com/i3/2057565955/TB2mTtxpCcqBKNjSZFgXXX_kXXa_!!2057565955.jpg"]}
                 * title : 妈妈春夏中袖衬衫中老年春秋装上衣中年女装方领开衫衬衣翻领寸衣
                 * tk_total_commi : 39.05
                 * tk_total_sales : 4
                 * url : //s.click.taobao.com/t?e=m%3D2%26s%3DswAGCascijQcQipKwQzePOeEDrYVVa64r4ll3HtqqoxylongkUhsv0IHZqX1EtRHj2CUndNJbpFtm5nS0VR3oT0KAZCke%2BMGJxC%2FP4%2FZfPFbcQmwDRwHnn1oN8CPq4PKMSBaygToy7Xnfzd0Ht55GHC1%2BSCzEp%2BTdjB7r%2B0aDb9HA690f%2B0EVnnkkeW8MvsjlxC5oYwS6hAvjM7YyINweHVINgCELUUjKxiXvDf8DaRs%3D&scm=null&pvid=100_11.178.152.29_56668_3151571384288323416&app_pvid=59590_11.132.118.97_471_1571384288318&ptl=floorId:2836;originalFloorId:2836;pvid:100_11.178.152.29_56668_3151571384288323416;app_pvid:59590_11.132.118.97_471_1571384288318&xId=wm6j8egf2ll49M1iOAFxKwwIVcjbXJa5NeK7C5qc0r4m8v12wC3pSAfQZbaYT8AwwVaCk5s9yBcMwqjJx3HQUo&union_lens=lensId%3A0b847661_0df1_16dddcd64d2_ab83
                 * user_type : 1
                 * volume : 12
                 * white_image : https://img.alicdn.com/bao/uploaded/TB20CmEpoOWBKNjSZKzXXXfWFXa_!!2057565955.png
                 * x_id : wm6j8egf2ll49M1iOAFxKwwIVcjbXJa5NeK7C5qc0r4m8v12wC3pSAfQZbaYT8AwwVaCk5s9yBcMwqjJx3HQUo
                 * zk_final_price : 68
                 * jdd_num : 2
                 * jdd_price : 99
                 * oetime : 2019-10-21 00:00:00
                 * ostime : 2019-10-11 16:00:01
                 */

                private long category_id;
                private String category_name;
                private String commission_rate;
                private String commission_type;
                private String coupon_amount;
                private String coupon_end_time;
                private String coupon_id;
                private String coupon_info;
                private long coupon_remain_count;
                private String coupon_share_url;
                private String coupon_start_fee;
                private String coupon_start_time;
                private long coupon_total_count;
                private String include_dxjh;
                private String include_mkt;
                private String info_dxjh;
                private String item_description;
                private long item_id;
                private String item_url;
                private long level_one_category_id;
                private String level_one_category_name;
                private String nick;
                private long num_iid;
                private String pict_url;
                private String presale_deposit;
                private long presale_end_time;
                private long presale_start_time;
                private long presale_tail_end_time;
                private long presale_tail_start_time;
                private String provcity;
                private String real_post_fee;
                private String reserve_price;
                private long seller_id;
                private long shop_dsr;
                private String shop_title;
                private String short_title;
                private SmallImagesBean small_images;
                private String title;
                private String tk_total_commi;
                private String tk_total_sales;
                private String url;
                private long user_type;
                private long volume;
                private String white_image;
                private String x_id;
                private String zk_final_price;
                private long jdd_num;
                private String jdd_price;
                private String oetime;
                private String ostime;

                public long getCategory_id() {
                    return category_id;
                }

                public void setCategory_id(long category_id) {
                    this.category_id = category_id;
                }

                public String getCategory_name() {
                    return category_name;
                }

                public void setCategory_name(String category_name) {
                    this.category_name = category_name;
                }

                public String getCommission_rate() {
                    return commission_rate;
                }

                public void setCommission_rate(String commission_rate) {
                    this.commission_rate = commission_rate;
                }

                public String getCommission_type() {
                    return commission_type;
                }

                public void setCommission_type(String commission_type) {
                    this.commission_type = commission_type;
                }

                public String getCoupon_amount() {
                    return coupon_amount;
                }

                public void setCoupon_amount(String coupon_amount) {
                    this.coupon_amount = coupon_amount;
                }

                public String getCoupon_end_time() {
                    return coupon_end_time;
                }

                public void setCoupon_end_time(String coupon_end_time) {
                    this.coupon_end_time = coupon_end_time;
                }

                public String getCoupon_id() {
                    return coupon_id;
                }

                public void setCoupon_id(String coupon_id) {
                    this.coupon_id = coupon_id;
                }

                public String getCoupon_info() {
                    return coupon_info;
                }

                public void setCoupon_info(String coupon_info) {
                    this.coupon_info = coupon_info;
                }

                public long getCoupon_remain_count() {
                    return coupon_remain_count;
                }

                public void setCoupon_remain_count(long coupon_remain_count) {
                    this.coupon_remain_count = coupon_remain_count;
                }

                public String getCoupon_share_url() {
                    return coupon_share_url;
                }

                public void setCoupon_share_url(String coupon_share_url) {
                    this.coupon_share_url = coupon_share_url;
                }

                public String getCoupon_start_fee() {
                    return coupon_start_fee;
                }

                public void setCoupon_start_fee(String coupon_start_fee) {
                    this.coupon_start_fee = coupon_start_fee;
                }

                public String getCoupon_start_time() {
                    return coupon_start_time;
                }

                public void setCoupon_start_time(String coupon_start_time) {
                    this.coupon_start_time = coupon_start_time;
                }

                public long getCoupon_total_count() {
                    return coupon_total_count;
                }

                public void setCoupon_total_count(long coupon_total_count) {
                    this.coupon_total_count = coupon_total_count;
                }

                public String getInclude_dxjh() {
                    return include_dxjh;
                }

                public void setInclude_dxjh(String include_dxjh) {
                    this.include_dxjh = include_dxjh;
                }

                public String getInclude_mkt() {
                    return include_mkt;
                }

                public void setInclude_mkt(String include_mkt) {
                    this.include_mkt = include_mkt;
                }

                public String getInfo_dxjh() {
                    return info_dxjh;
                }

                public void setInfo_dxjh(String info_dxjh) {
                    this.info_dxjh = info_dxjh;
                }

                public String getItem_description() {
                    return item_description;
                }

                public void setItem_description(String item_description) {
                    this.item_description = item_description;
                }

                public long getItem_id() {
                    return item_id;
                }

                public void setItem_id(long item_id) {
                    this.item_id = item_id;
                }

                public String getItem_url() {
                    return item_url;
                }

                public void setItem_url(String item_url) {
                    this.item_url = item_url;
                }

                public long getLevel_one_category_id() {
                    return level_one_category_id;
                }

                public void setLevel_one_category_id(long level_one_category_id) {
                    this.level_one_category_id = level_one_category_id;
                }

                public String getLevel_one_category_name() {
                    return level_one_category_name;
                }

                public void setLevel_one_category_name(String level_one_category_name) {
                    this.level_one_category_name = level_one_category_name;
                }

                public String getNick() {
                    return nick;
                }

                public void setNick(String nick) {
                    this.nick = nick;
                }

                public long getNum_iid() {
                    return num_iid;
                }

                public void setNum_iid(long num_iid) {
                    this.num_iid = num_iid;
                }

                public String getPict_url() {
                    return pict_url;
                }

                public void setPict_url(String pict_url) {
                    this.pict_url = pict_url;
                }

                public String getPresale_deposit() {
                    return presale_deposit;
                }

                public void setPresale_deposit(String presale_deposit) {
                    this.presale_deposit = presale_deposit;
                }

                public long getPresale_end_time() {
                    return presale_end_time;
                }

                public void setPresale_end_time(long presale_end_time) {
                    this.presale_end_time = presale_end_time;
                }

                public long getPresale_start_time() {
                    return presale_start_time;
                }

                public void setPresale_start_time(long presale_start_time) {
                    this.presale_start_time = presale_start_time;
                }

                public long getPresale_tail_end_time() {
                    return presale_tail_end_time;
                }

                public void setPresale_tail_end_time(long presale_tail_end_time) {
                    this.presale_tail_end_time = presale_tail_end_time;
                }

                public long getPresale_tail_start_time() {
                    return presale_tail_start_time;
                }

                public void setPresale_tail_start_time(long presale_tail_start_time) {
                    this.presale_tail_start_time = presale_tail_start_time;
                }

                public String getProvcity() {
                    return provcity;
                }

                public void setProvcity(String provcity) {
                    this.provcity = provcity;
                }

                public String getReal_post_fee() {
                    return real_post_fee;
                }

                public void setReal_post_fee(String real_post_fee) {
                    this.real_post_fee = real_post_fee;
                }

                public String getReserve_price() {
                    return reserve_price;
                }

                public void setReserve_price(String reserve_price) {
                    this.reserve_price = reserve_price;
                }

                public long getSeller_id() {
                    return seller_id;
                }

                public void setSeller_id(long seller_id) {
                    this.seller_id = seller_id;
                }

                public long getShop_dsr() {
                    return shop_dsr;
                }

                public void setShop_dsr(long shop_dsr) {
                    this.shop_dsr = shop_dsr;
                }

                public String getShop_title() {
                    return shop_title;
                }

                public void setShop_title(String shop_title) {
                    this.shop_title = shop_title;
                }

                public String getShort_title() {
                    return short_title;
                }

                public void setShort_title(String short_title) {
                    this.short_title = short_title;
                }

                public SmallImagesBean getSmall_images() {
                    return small_images;
                }

                public void setSmall_images(SmallImagesBean small_images) {
                    this.small_images = small_images;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getTk_total_commi() {
                    return tk_total_commi;
                }

                public void setTk_total_commi(String tk_total_commi) {
                    this.tk_total_commi = tk_total_commi;
                }

                public String getTk_total_sales() {
                    return tk_total_sales;
                }

                public void setTk_total_sales(String tk_total_sales) {
                    this.tk_total_sales = tk_total_sales;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public long getUser_type() {
                    return user_type;
                }

                public void setUser_type(long user_type) {
                    this.user_type = user_type;
                }

                public long getVolume() {
                    return volume;
                }

                public void setVolume(long volume) {
                    this.volume = volume;
                }

                public String getWhite_image() {
                    return white_image;
                }

                public void setWhite_image(String white_image) {
                    this.white_image = white_image;
                }

                public String getX_id() {
                    return x_id;
                }

                public void setX_id(String x_id) {
                    this.x_id = x_id;
                }

                public String getZk_final_price() {
                    return zk_final_price;
                }

                public void setZk_final_price(String zk_final_price) {
                    this.zk_final_price = zk_final_price;
                }

                public long getJdd_num() {
                    return jdd_num;
                }

                public void setJdd_num(long jdd_num) {
                    this.jdd_num = jdd_num;
                }

                public String getJdd_price() {
                    return jdd_price;
                }

                public void setJdd_price(String jdd_price) {
                    this.jdd_price = jdd_price;
                }

                public String getOetime() {
                    return oetime;
                }

                public void setOetime(String oetime) {
                    this.oetime = oetime;
                }

                public String getOstime() {
                    return ostime;
                }

                public void setOstime(String ostime) {
                    this.ostime = ostime;
                }

                public static class SmallImagesBean {
                    private List<String> string;

                    public List<String> getString() {
                        return string;
                    }

                    public void setString(List<String> string) {
                        this.string = string;
                    }
                }
            }
        }
    }
}
