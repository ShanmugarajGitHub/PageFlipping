package com.example.shanmugarajjoveeinfo.pageflipjava.components.ui.containers.interfaces;

import android.view.View;

/**
 * Created by shanmugarajjoveeinfo on 7/5/18.
 */

public interface IRemovableItemsAdapterComponent  {
    /**
     * Called when item is removed from component by user clicking on remove button
     * @return true, if you removed item from adapter manually in this step
     */
    boolean onItemRemove(int position, View view, Object item);
}