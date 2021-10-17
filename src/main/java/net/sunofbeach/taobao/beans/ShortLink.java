package net.sunofbeach.taobao.beans;

import java.util.List;

public class ShortLink {


    /**
     * tbk_spread_get_response : {"results":{"tbk_spread":[{"content":"https://s.click.taobao.com/SkJj5zu","err_msg":"OK"}]},"total_results":1,"request_id":"xss0ncpeagvs"}
     */

    private TbkSpreadGetResponseBean tbk_spread_get_response;

    public TbkSpreadGetResponseBean getTbk_spread_get_response() {
        return tbk_spread_get_response;
    }

    public void setTbk_spread_get_response(TbkSpreadGetResponseBean tbk_spread_get_response) {
        this.tbk_spread_get_response = tbk_spread_get_response;
    }

    public static class TbkSpreadGetResponseBean {
        /**
         * results : {"tbk_spread":[{"content":"https://s.click.taobao.com/SkJj5zu","err_msg":"OK"}]}
         * total_results : 1
         * request_id : xss0ncpeagvs
         */

        private ResultsBean results;
        private int total_results;
        private String request_id;

        public ResultsBean getResults() {
            return results;
        }

        public void setResults(ResultsBean results) {
            this.results = results;
        }

        public int getTotal_results() {
            return total_results;
        }

        public void setTotal_results(int total_results) {
            this.total_results = total_results;
        }

        public String getRequest_id() {
            return request_id;
        }

        public void setRequest_id(String request_id) {
            this.request_id = request_id;
        }

        public static class ResultsBean {
            private List<TbkSpreadBean> tbk_spread;

            public List<TbkSpreadBean> getTbk_spread() {
                return tbk_spread;
            }

            public void setTbk_spread(List<TbkSpreadBean> tbk_spread) {
                this.tbk_spread = tbk_spread;
            }

            public static class TbkSpreadBean {
                /**
                 * content : https://s.click.taobao.com/SkJj5zu
                 * err_msg : OK
                 */

                private String content;
                private String err_msg;

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getErr_msg() {
                    return err_msg;
                }

                public void setErr_msg(String err_msg) {
                    this.err_msg = err_msg;
                }
            }
        }
    }
}
