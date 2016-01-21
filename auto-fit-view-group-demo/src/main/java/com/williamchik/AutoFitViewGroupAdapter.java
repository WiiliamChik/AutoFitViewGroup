package com.williamchik;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * item adapter of AutoFitViewGroup, to bind data to AutoFitViewGroup, like RecyclerView's Adapter class.
 *
 * @author WilliamChik on 15/9/26.
 */
public class AutoFitViewGroupAdapter extends AutoFitViewGroup.Adapter {

  public List<String> mData = new ArrayList<>();

  public Activity mActivity;

  public LayoutInflater mInflater;

  public AutoFitViewGroupAdapter(Activity activity) {
    mActivity = activity;
    mInflater = activity.getLayoutInflater();
  }

  @Override
  public AutoFitViewGroup.ViewHolder onCreateViewHolder() {
    View convertView = mInflater.inflate(R.layout.auto_fit_view_group_item, null);
    if (convertView == null) {
      return null;
    }
    return new AutoFitViewGroupItemViewHolder(convertView);
  }

  @Override
  public void onBindViewHolder(AutoFitViewGroup.ViewHolder holder, int position) {
    if (!(holder instanceof AutoFitViewGroupItemViewHolder) || !(getItem(position) instanceof String)) {
      return;
    }
    AutoFitViewGroupItemViewHolder newHolder = (AutoFitViewGroupItemViewHolder) holder;
    String newItem = getItem(position);

    if (!TextUtils.isEmpty(newItem)) {
      newHolder.demoGroupItemTv.setText(newItem);
    }

  }

  @Override
  public int getItemCount() {
    return mData.size();
  }

  public void addDataList(List<String> dataList) {
    mData.addAll(dataList);
  }

  public String getItem(int position) {
    if (position < getItemCount()) {
      return mData.get(position);
    }
    return null;
  }

}
