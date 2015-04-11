package com.cxyliuyu.cyjszs.activity;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.cxyliuyu.cyjszs.SQL.NotificationSqliteOpenHelper;
import com.cxyliuyu.cyjszs.R;

public class NotificationActivity extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification);
		Button testButton = (Button)findViewById(R.id.btn_notification_test);
		testButton.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.notification, menu);
		return true;
	}
	

	@Override
	public void onClick(View view) {
		// TODO 自动生成的方法存根
		switch (view.getId()){
		case R.id.btn_notification_test:
			NotificationAsyncTask notificationAsyncTask = new NotificationAsyncTask();
			notificationAsyncTask.execute("");
			break;
		}
			
		
	}
	
	
	class NotificationAsyncTask extends AsyncTask<String, Integer, String>{

		@Override
		protected String doInBackground(String... arg0) {
			// TODO 自动生成的方法存根
			Log.i("notification","测试建表是否成功");
			NotificationSqliteOpenHelper notificationSqliteOpenHelper = new NotificationSqliteOpenHelper(NotificationActivity.this,"TeacherHelper.db",null,1);
			SQLiteDatabase db = notificationSqliteOpenHelper.getWritableDatabase();
			return null;
		}

		@Override
		protected void onPostExecute(String result) {
			// TODO 自动生成的方法存根
			super.onPostExecute(result);
		}

	}

}





