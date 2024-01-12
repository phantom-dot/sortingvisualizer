package com.sahil.sortvisualizerfx.sorting;

public interface SortCallback {
    void onStart();
    void onFinished();
    void onInterrupted();
    void cursors(int... cursors);
}
