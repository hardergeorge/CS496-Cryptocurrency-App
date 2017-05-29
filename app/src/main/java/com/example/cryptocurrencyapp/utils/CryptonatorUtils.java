package com.example.cryptocurrencyapp.utils;

import android.net.ParseException;
import android.net.Uri;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by harderg on 5/25/17.
 */

public class CryptonatorUtils {

    private final static String CRYPTO_BASE_URL = "https://api.cryptonator.com/api/ticker/";

    public static class CryptoCurrencyItem implements Serializable {
        public static final String EXTRA_CRYPTO_RESULT = "CryptonatorUtils.CryptoCurrencyItem";

        //TODO: Add fields
        String name;
    }

    public static String buildCryptonatorURL (String currencyName) {
        //TODO: Add necessary params
        return Uri.parse(CRYPTO_BASE_URL).buildUpon()
                .appendPath(currencyName)
                .build()
                .toString();
    }

    public static ArrayList<CryptoCurrencyItem> parseCryptocurrencyJSON(String cryptocurrencyJSON) {
        try {
            JSONObject cryptoCurrencyObj = new JSONObject(cryptocurrencyJSON);
            JSONArray cryptoCurrencyList = cryptoCurrencyObj.getJSONArray("ticker");

            ArrayList<CryptoCurrencyItem> cryptoCurrencyItemsList = new ArrayList<>();

            for (int i = 0; i < cryptoCurrencyList.length(); i++) {
                //TODO: parse JSON
            }
            return cryptoCurrencyItemsList;

        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
