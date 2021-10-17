package net.sunofbeach.taobao.beans;

import java.util.List;

public class MainPageMenu {

    /**
     * tbk_uatm_favorites_get_response : {"results":{"tbk_favorites":[{"type":1,"favorites_id":100,"favorites_title":"女装选品组"}]},"total_results":100}
     */

    private TbkUatmFavoritesGetResponseBean tbk_uatm_favorites_get_response;

    public TbkUatmFavoritesGetResponseBean getTbk_uatm_favorites_get_response() {
        return tbk_uatm_favorites_get_response;
    }

    public void setTbk_uatm_favorites_get_response(TbkUatmFavoritesGetResponseBean tbk_uatm_favorites_get_response) {
        this.tbk_uatm_favorites_get_response = tbk_uatm_favorites_get_response;
    }

    public static class TbkUatmFavoritesGetResponseBean {
        /**
         * results : {"tbk_favorites":[{"type":1,"favorites_id":100,"favorites_title":"女装选品组"}]}
         * total_results : 100
         */

        private ResultsBean results;
        private int total_results;

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

        public static class ResultsBean {
            private List<TbkFavoritesBean> tbk_favorites;

            public List<TbkFavoritesBean> getTbk_favorites() {
                return tbk_favorites;
            }

            public void setTbk_favorites(List<TbkFavoritesBean> tbk_favorites) {
                this.tbk_favorites = tbk_favorites;
            }

            public static class TbkFavoritesBean {
                /**
                 * type : 1
                 * favorites_id : 100
                 * favorites_title : 女装选品组
                 */

                private int type;
                private int favorites_id;
                private String favorites_title;

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

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
