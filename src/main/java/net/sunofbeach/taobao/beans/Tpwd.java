package net.sunofbeach.taobao.beans;

public class Tpwd {


    /**
     * tbk_tpwd_create_response : {"data":{"model":"￥y6foYCTHmkb￥"},"request_id":"5sj11qv10rbg"}
     */

    private TbkTpwdCreateResponseBean tbk_tpwd_create_response;

    public TbkTpwdCreateResponseBean getTbk_tpwd_create_response() {
        return tbk_tpwd_create_response;
    }

    public void setTbk_tpwd_create_response(TbkTpwdCreateResponseBean tbk_tpwd_create_response) {
        this.tbk_tpwd_create_response = tbk_tpwd_create_response;
    }

    public static class TbkTpwdCreateResponseBean {
        /**
         * data : {"model":"￥y6foYCTHmkb￥"}
         * request_id : 5sj11qv10rbg
         */

        private DataBean data;
        private String request_id;

        public DataBean getData() {
            return data;
        }

        public void setData(DataBean data) {
            this.data = data;
        }

        public String getRequest_id() {
            return request_id;
        }

        public void setRequest_id(String request_id) {
            this.request_id = request_id;
        }

        public static class DataBean {
            /**
             * model : ￥y6foYCTHmkb￥
             */

            private String model;

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }
        }
    }
}
