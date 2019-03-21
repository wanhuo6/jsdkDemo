package cn.imeiadx.JsdkDemo;

import android.webkit.JavascriptInterface;

import cn.wisemedia.jy.mob.JyJS;
import cn.wisemedia.mob.WLog;

public class TestJs extends JyJS
{
	@JavascriptInterface  
	public void adcallback()
	{
		WLog.d("没有广告进行回调。");
	}

}
