package net.sunofbeach.taobao.beans;

import java.util.List;

public class RelativeItem {

    /**
     * tbk_item_recommend_get_response : {"results":{"n_tbk_item":[{"item_url":"http://item.taobao.com/item.htm?id=586409791994","num_iid":586409791994,"pict_url":"https://img.alicdn.com/tfscom/i1/850484481/O1CN01B5dq8Z1iyLGULHvUL_!!850484481.jpg","provcity":"浙江 杭州","reserve_price":"298.00","small_images":{"string":["https://img.alicdn.com/tfscom/i3/850484481/O1CN01qFYkTC1iyLGTSLRkX_!!850484481.jpg","https://img.alicdn.com/tfscom/i4/850484481/O1CN01mwzVwu1iyLGVSpVqR_!!850484481.jpg","https://img.alicdn.com/tfscom/i3/850484481/O1CN01ADr7uK1iyLGTRyQHB_!!850484481.jpg","https://img.alicdn.com/tfscom/i3/850484481/O1CN0146mqNO1iyLGa2yLYD_!!850484481.jpg"]},"title":"羽绒棉背心女士马夹外穿韩版加厚中长款宽松秋冬网红棉马甲外套潮","user_type":0,"zk_final_price":"65.00"}]},"request_id":"pgq75ha2h9p1"}
     */

    private TbkItemRecommendGetResponseBean tbk_item_recommend_get_response;

    public TbkItemRecommendGetResponseBean getTbk_item_recommend_get_response() {
        return tbk_item_recommend_get_response;
    }

    public void setTbk_item_recommend_get_response(TbkItemRecommendGetResponseBean tbk_item_recommend_get_response) {
        this.tbk_item_recommend_get_response = tbk_item_recommend_get_response;
    }

    public static class TbkItemRecommendGetResponseBean {
        /**
         * results : {"n_tbk_item":[{"item_url":"http://item.taobao.com/item.htm?id=586409791994","num_iid":586409791994,"pict_url":"https://img.alicdn.com/tfscom/i1/850484481/O1CN01B5dq8Z1iyLGULHvUL_!!850484481.jpg","provcity":"浙江 杭州","reserve_price":"298.00","small_images":{"string":["https://img.alicdn.com/tfscom/i3/850484481/O1CN01qFYkTC1iyLGTSLRkX_!!850484481.jpg","https://img.alicdn.com/tfscom/i4/850484481/O1CN01mwzVwu1iyLGVSpVqR_!!850484481.jpg","https://img.alicdn.com/tfscom/i3/850484481/O1CN01ADr7uK1iyLGTRyQHB_!!850484481.jpg","https://img.alicdn.com/tfscom/i3/850484481/O1CN0146mqNO1iyLGa2yLYD_!!850484481.jpg"]},"title":"羽绒棉背心女士马夹外穿韩版加厚中长款宽松秋冬网红棉马甲外套潮","user_type":0,"zk_final_price":"65.00"}]}
         * request_id : pgq75ha2h9p1
         */

        private ResultsBean results;
        private String request_id;

        public ResultsBean getResults() {
            return results;
        }

        public void setResults(ResultsBean results) {
            this.results = results;
        }

        public String getRequest_id() {
            return request_id;
        }

        public void setRequest_id(String request_id) {
            this.request_id = request_id;
        }

        public static class ResultsBean {
            private List<NTbkItemBean> n_tbk_item;

            public List<NTbkItemBean> getN_tbk_item() {
                return n_tbk_item;
            }

            public void setN_tbk_item(List<NTbkItemBean> n_tbk_item) {
                this.n_tbk_item = n_tbk_item;
            }

            public static class NTbkItemBean {
                /**
                 * item_url : http://item.taobao.com/item.htm?id=586409791994
                 * num_iid : 586409791994
                 * pict_url : https://img.alicdn.com/tfscom/i1/850484481/O1CN01B5dq8Z1iyLGULHvUL_!!850484481.jpg
                 * provcity : 浙江 杭州
                 * reserve_price : 298.00
                 * small_images : {"string":["https://img.alicdn.com/tfscom/i3/850484481/O1CN01qFYkTC1iyLGTSLRkX_!!850484481.jpg","https://img.alicdn.com/tfscom/i4/850484481/O1CN01mwzVwu1iyLGVSpVqR_!!850484481.jpg","https://img.alicdn.com/tfscom/i3/850484481/O1CN01ADr7uK1iyLGTRyQHB_!!850484481.jpg","https://img.alicdn.com/tfscom/i3/850484481/O1CN0146mqNO1iyLGa2yLYD_!!850484481.jpg"]}
                 * title : 羽绒棉背心女士马夹外穿韩版加厚中长款宽松秋冬网红棉马甲外套潮
                 * user_type : 0
                 * zk_final_price : 65.00
                 */

                private String item_url;
                private long num_iid;
                private String pict_url;
                private String provcity;
                private String reserve_price;
                private SmallImagesBean small_images;
                private String title;
                private int user_type;
                private String zk_final_price;

                public String getItem_url() {
                    return item_url;
                }

                public void setItem_url(String item_url) {
                    this.item_url = item_url;
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

                public String getProvcity() {
                    return provcity;
                }

                public void setProvcity(String provcity) {
                    this.provcity = provcity;
                }

                public String getReserve_price() {
                    return reserve_price;
                }

                public void setReserve_price(String reserve_price) {
                    this.reserve_price = reserve_price;
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

                public int getUser_type() {
                    return user_type;
                }

                public void setUser_type(int user_type) {
                    this.user_type = user_type;
                }

                public String getZk_final_price() {
                    return zk_final_price;
                }

                public void setZk_final_price(String zk_final_price) {
                    this.zk_final_price = zk_final_price;
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
