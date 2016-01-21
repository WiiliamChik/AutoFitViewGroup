package com.williamchik;

import android.view.View;
import android.widget.TextView;

/**
 * view holder of AutoFitViewGroup's item, like RecyclerView's ViewHolder class
 *
 * @author WilliamChik on 15/9/26.
 */
public class AutoFitViewGroupItemViewHolder extends AutoFitViewGroup.ViewHolder {

  public TextView demoGroupItemTv;

  public AutoFitViewGroupItemViewHolder(View itemView) {
    super(itemView);
    demoGroupItemTv = (TextView) itemView.findViewById(R.id.tv_demo_group_item);
  }
}
