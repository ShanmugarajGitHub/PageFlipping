package com.example.shanmugarajjoveeinfo.pageflipjava.components.ui.containers.interfaces;

import android.view.View;

/**
 * Created by shanmugarajjoveeinfo on 7/5/18.
 */

public interface IViewObserver {
    /**
     * @param v View which is getting removed
     * @param position View position in adapter
     */
    void onViewRemovedFromParent(View v, int position);
}
