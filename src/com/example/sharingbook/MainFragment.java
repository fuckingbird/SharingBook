package com.example.sharingbook;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;

public class MainFragment extends Fragment {
	private int pos;
	private Activity act;
	final static int a[] = new int[] { 0, R.string.setting, R.string.logout };

	Bitmap upicBP = null;
	ListView listview = null;
	ProgressBar progressbar = null;

	public MainFragment(int position, Activity activity) {
		pos = position;
		act = activity;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		ViewGroup rootView;

		rootView = (ViewGroup) inflater
				.inflate(R.layout.frag, container, false);

		return rootView;
	}

}