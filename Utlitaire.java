package etu001799.framework;
import etu001799.framework.Mapping;

import java.util.HashMap;




public class Utlitaire {

    public String getURL(String baseURL, String path,  HashMap<String,Mapping> queryParams) {

        StringBuilder urlBuilder = new StringBuilder(baseURL);
        
        // Ajouter le chemin s'il n'est pas nul ou vide
        if (path != null && !path.isEmpty()) {
            if (!path.startsWith("/")) {
                urlBuilder.append("/");
            }
            urlBuilder.append(path);
        }
        
        // Ajouter les paramètres de requête s'il y en a
        if (queryParams != null && !queryParams.isEmpty()) {
            urlBuilder.append("?");
            for (String key : queryParams.keySet()) {
                urlBuilder.append(key).append("=").append(queryParams.get(key)).append("&");
            }
            urlBuilder.deleteCharAt(urlBuilder.length() - 1);
        }
        
        return urlBuilder.toString();
    }    
}
