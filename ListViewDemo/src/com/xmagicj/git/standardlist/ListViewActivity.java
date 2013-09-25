package com.xmagicj.git.standardlist;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

import com.wistron.swpc.commonlib.listviewdemo.R;

/**
 * Main Activity 
 * The main display area, and provide context
 * @author Mumu
 * 
 */
public class ListViewActivity extends Activity {
	/** ListView */
	private ListView mListView;
	/** Adapter extends BaseAdapter */
	private ListViewAdapter mListViewAdapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// Get handle to listview
		mListView = (ListView) findViewById(R.id.lv_main);
		mListViewAdapter = new ListViewAdapter(ListViewActivity.this);
		// List bundled with Adapter
		mListView.setAdapter(mListViewAdapter);
		// The following is used to test the item click event
		mListView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				int count = arg2 + 1;
				Toast.makeText(ListViewActivity.this, "Touch " + count, Toast.LENGTH_SHORT).show();
			}
		});
	}
}
