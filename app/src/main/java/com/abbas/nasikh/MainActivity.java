package com.abbas.nasikh;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int dp(float value) {
        return (int) (value * getResources().getDisplayMetrics().density + 0.5f);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        root.setPadding(dp(24), dp(48), dp(24), dp(24));
        root.setBackgroundColor(Color.rgb(247, 249, 252));

        TextView title = new TextView(this);
        title.setText("ناسخ");
        title.setTextSize(32);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setTextColor(Color.rgb(32, 55, 85));
        title.setGravity(Gravity.CENTER);
        root.addView(title, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(60)));

        TextView subtitle = new TextView(this);
        subtitle.setText("استنساخ التطبيقات والألعاب");
        subtitle.setTextSize(18);
        subtitle.setTextColor(Color.rgb(80, 92, 108));
        subtitle.setGravity(Gravity.CENTER);
        root.addView(subtitle, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(48)));

        TextView game = new TextView(this);
        game.setText("اللعبة المستهدفة\nHay Day");
        game.setTextSize(20);
        game.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        game.setTextColor(Color.rgb(45, 65, 80));
        game.setGravity(Gravity.CENTER);
        game.setBackgroundColor(Color.WHITE);
        LinearLayout.LayoutParams gameParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(110));
        gameParams.setMargins(0, dp(36), 0, dp(20));
        root.addView(game, gameParams);

        Button cloneButton = new Button(this);
        cloneButton.setText("استنساخ اللعبة");
        cloneButton.setAllCaps(false);
        cloneButton.setTextSize(18);
        cloneButton.setOnClickListener(v -> new AlertDialog.Builder(this)
                .setTitle("ناسخ")
                .setMessage("واجهة التطبيق الأولية جاهزة. محرك الاستنساخ لم يُدمج بعد، لذلك لم يتم إنشاء نسخة من Hay Day.")
                .setPositiveButton("حسناً", null)
                .show());
        root.addView(cloneButton, new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(56)));

        TextView status = new TextView(this);
        status.setText("الحالة: واجهة أولية — محرك الاستنساخ قيد التطوير");
        status.setTextSize(14);
        status.setTextColor(Color.rgb(115, 122, 132));
        status.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams statusParams = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, dp(72));
        statusParams.setMargins(0, dp(18), 0, 0);
        root.addView(status, statusParams);

        setContentView(root);
    }
}
