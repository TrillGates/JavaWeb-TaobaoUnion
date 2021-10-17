package net.sunofbeach.taobao.beans;

import java.util.List;

public class MainPageMenuNew {


    /**
     * tbk_dg_optimus_material_response : {"is_default":"false","result_list":{"map_data":[{"coupon_amount":0,"coupon_start_fee":"0.0","favorites_info":{"favorites_list":{"favorites_detail":[{"favorites_id":2018933013,"favorites_title":"中秋礼品"},{"favorites_id":2011849245,"favorites_title":"节日礼物"},{"favorites_id":2011849244,"favorites_title":"程序员必备"},{"favorites_id":2011849243,"favorites_title":"秋天必备"},{"favorites_id":2011849242,"favorites_title":"电脑周边"},{"favorites_id":2011849241,"favorites_title":"熬夜护理"},{"favorites_id":2011849239,"favorites_title":"日常用品"},{"favorites_id":2011849237,"favorites_title":"办公室零食"},{"favorites_id":2011849236,"favorites_title":"热门推荐"}]},"total_count":9}}]},"request_id":"4uyebvwg39c4"}
     */

    private TbkDgOptimusMaterialResponseBean tbk_dg_optimus_material_response;

    public TbkDgOptimusMaterialResponseBean getTbk_dg_optimus_material_response() {
        return tbk_dg_optimus_material_response;
    }

    public void setTbk_dg_optimus_material_response(TbkDgOptimusMaterialResponseBean tbk_dg_optimus_material_response) {
        this.tbk_dg_optimus_material_response = tbk_dg_optimus_material_response;
    }

    public static class TbkDgOptimusMaterialResponseBean {
        /**
         * is_default : false
         * result_list : {"map_data":[{"coupon_amount":0,"coupon_start_fee":"0.0","favorites_info":{"favorites_list":{"favorites_detail":[{"favorites_id":2018933013,"favorites_title":"中秋礼品"},{"favorites_id":2011849245,"favorites_title":"节日礼物"},{"favorites_id":2011849244,"favorites_title":"程序员必备"},{"favorites_id":2011849243,"favorites_title":"秋天必备"},{"favorites_id":2011849242,"favorites_title":"电脑周边"},{"favorites_id":2011849241,"favorites_title":"熬夜护理"},{"favorites_id":2011849239,"favorites_title":"日常用品"},{"favorites_id":2011849237,"favorites_title":"办公室零食"},{"favorites_id":2011849236,"favorites_title":"热门推荐"}]},"total_count":9}}]}
         * request_id : 4uyebvwg39c4
         */

        private String is_default;
        private ResultListBean result_list;
        private String request_id;

        public String getIs_default() {
            return is_default;
        }

        public void setIs_default(String is_default) {
            this.is_default = is_default;
        }

        public ResultListBean getResult_list() {
            return result_list;
        }

        public void setResult_list(ResultListBean result_list) {
            this.result_list = result_list;
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
                 * coupon_amount : 0
                 * coupon_start_fee : 0.0
                 * favorites_info : {"favorites_list":{"favorites_detail":[{"favorites_id":2018933013,"favorites_title":"中秋礼品"},{"favorites_id":2011849245,"favorites_title":"节日礼物"},{"favorites_id":2011849244,"favorites_title":"程序员必备"},{"favorites_id":2011849243,"favorites_title":"秋天必备"},{"favorites_id":2011849242,"favorites_title":"电脑周边"},{"favorites_id":2011849241,"favorites_title":"熬夜护理"},{"favorites_id":2011849239,"favorites_title":"日常用品"},{"favorites_id":2011849237,"favorites_title":"办公室零食"},{"favorites_id":2011849236,"favorites_title":"热门推荐"}]},"total_count":9}
                 */

                private int coupon_amount;
                private String coupon_start_fee;
                private FavoritesInfoBean favorites_info;

                public int getCoupon_amount() {
                    return coupon_amount;
                }

                public void setCoupon_amount(int coupon_amount) {
                    this.coupon_amount = coupon_amount;
                }

                public String getCoupon_start_fee() {
                    return coupon_start_fee;
                }

                public void setCoupon_start_fee(String coupon_start_fee) {
                    this.coupon_start_fee = coupon_start_fee;
                }

                public FavoritesInfoBean getFavorites_info() {
                    return favorites_info;
                }

                public void setFavorites_info(FavoritesInfoBean favorites_info) {
                    this.favorites_info = favorites_info;
                }

                public static class FavoritesInfoBean {
                    /**
                     * favorites_list : {"favorites_detail":[{"favorites_id":2018933013,"favorites_title":"中秋礼品"},{"favorites_id":2011849245,"favorites_title":"节日礼物"},{"favorites_id":2011849244,"favorites_title":"程序员必备"},{"favorites_id":2011849243,"favorites_title":"秋天必备"},{"favorites_id":2011849242,"favorites_title":"电脑周边"},{"favorites_id":2011849241,"favorites_title":"熬夜护理"},{"favorites_id":2011849239,"favorites_title":"日常用品"},{"favorites_id":2011849237,"favorites_title":"办公室零食"},{"favorites_id":2011849236,"favorites_title":"热门推荐"}]}
                     * total_count : 9
                     */

                    private FavoritesListBean favorites_list;
                    private int total_count;

                    public FavoritesListBean getFavorites_list() {
                        return favorites_list;
                    }

                    public void setFavorites_list(FavoritesListBean favorites_list) {
                        this.favorites_list = favorites_list;
                    }

                    public int getTotal_count() {
                        return total_count;
                    }

                    public void setTotal_count(int total_count) {
                        this.total_count = total_count;
                    }

                    public static class FavoritesListBean {
                        private List<FavoritesDetailBean> favorites_detail;

                        public List<FavoritesDetailBean> getFavorites_detail() {
                            return favorites_detail;
                        }

                        public void setFavorites_detail(List<FavoritesDetailBean> favorites_detail) {
                            this.favorites_detail = favorites_detail;
                        }

                        public static class FavoritesDetailBean {
                            /**
                             * favorites_id : 2018933013
                             * favorites_title : 中秋礼品
                             */

                            private int favorites_id;
                            private String favorites_title;

                            public int getFavorites_id() {
                                return favorites_id;
                            }

                            public void setFavorites_id(int favorites_id) {
                                this.favorites_id = favorites_id;
                            }

                            public String getFavorites_title() {
                                return favorites_title;
                            }

                            public void setFavorites_title(String favorites_title) {
                                this.favorites_title = favorites_title;
                            }
                        }
                    }
                }
            }
        }
    }
}
