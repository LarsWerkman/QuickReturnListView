package com.larswerkman.quickreturnlistview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class QuickReturnListView extends ListView {

	public QuickReturnListView(Context context) {
		super(context);
	}

	public QuickReturnListView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public int computeVerticalScrollRange() {
		return super.computeVerticalScrollRange();
	}

	@Override
	public int computeVerticalScrollOffset() {
		return super.computeVerticalScrollOffset();
	}
}