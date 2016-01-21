package com.williamchik;

import android.app.Activity;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

/**
 * demo for using AutoFitViewgGroup
 *
 * @author WilliamChik on 15/9/26.
 */
public class AutoFitViewGroupDemoActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.auto_fit_view_group_demo_activity);
    initUI();
  }

  private void initUI() {
    AutoFitViewGroup mainLayout = (AutoFitViewGroup) findViewById(R.id.afvg_demo_main_layout);
    AutoFitViewGroupAdapter adapter = new AutoFitViewGroupAdapter(this);
    List dataList =
        Arrays.asList("面膜", "洁面", "卸妆", "纸尿裤", "奶粉", "睫毛膏", "韩国防晒霜", "维生素", "退热贴", "洗洁精", "沐浴乳", "护肤", "麦当娜护臂霜", "日本尤妮佳");
    adapter.addDataList(dataList);
    mainLayout.setAdapter(adapter);
  }
}
