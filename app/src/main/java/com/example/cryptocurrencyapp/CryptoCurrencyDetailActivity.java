package com.example.cryptocurrencyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.cryptocurrencyapp.utils.CryptonatorUtils;

/**
 * Created by harderg on 5/25/17.
 */

public class CryptoCurrencyDetailActivity extends AppCompatActivity {
    private TextView mCryptoCurrencyTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crypto_currency_item);

        mCryptoCurrencyTV = (TextView)findViewById(R.id.tv_crypto_currency_text);

        Intent intent = getIntent();
        if (intent != null) {
            CryptonatorUtils.CryptoCurrencyItem cryptoCurrencyItem = (CryptonatorUtils.CryptoCurrencyItem) intent.getSerializableExtra(CryptonatorUtils.CryptoCurrencyItem.EXTRA_CRYPTO_RESULT);
            mCryptoCurrencyTV.setText(cryptoCurrencyItem.toString());
        }
    }
}
