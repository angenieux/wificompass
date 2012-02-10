/*
 * Created on Feb 10, 2012
 * Author: Paul Woelfel
 * Email: frig@frig.at
 */
package at.fhstp.wificompass.view;

import org.metalev.multitouch.controller.MultiTouchController.PointInfo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public class SiteMap extends MultiTouchDrawable {
	
	
	
	protected static Bitmap bmp;
	
	
	
	protected int drawed=0;
	

	
	public SiteMap(Context ctx){
		super(ctx);
		init();
	}
	
	public SiteMap(Context ctx,MultiTouchDrawable superDrawable){
		super(ctx,superDrawable);
		init();
	}
	
	protected void init(){
		bmp=Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
		Canvas bmpCanvas=new Canvas(bmp);
		bmpCanvas.drawColor(Color.BLUE);
	}
	

	public Drawable getDrawable() {
		Bitmap bmpToDraw=Bitmap.createBitmap(bmp);
		Canvas cnv=new Canvas(bmpToDraw);
		Paint textPaint=new Paint();
		textPaint.setColor(Color.GREEN);
		cnv.save();
		cnv.rotate(angle * -180.0f / (float) Math.PI);
		cnv.drawText("Hallo "+drawed++, 40,40, textPaint);
		cnv.restore();
		return new BitmapDrawable(ctx.getResources(), bmpToDraw);
	}

	@Override
	public int getWidth() {
		return 400;
	}

	@Override
	public int getHeight() {
		return 300;
	}

	@Override
	public String getId() {
		return Integer.toString(id);
	}

	@Override
	public boolean onTouch(PointInfo pointinfo) {
		return false;
	}

	@Override
	public void setAngle(float angle) {
		this.angle=angle;
	}

	@Override
	public void setScale(float scaleX, float scaleY) {
		this.scaleX=scaleX;
		this.scaleY=scaleY;
	}

	@Override
	public void setRelativePosition(float xPos, float yPos) {
	}

	@Override
	public boolean isScalable() {
		return true;
	}

	@Override
	public boolean isRotateable() {
		return true;
	}

	@Override
	public boolean isDragable() {
		return true;
	}

	@Override
	public boolean isOnlyInSuper() {
		return false;
	}

	@Override
	public boolean hasSuperDrawable() {
		return false;
	}

	@Override
	public MultiTouchDrawable getSuperDrawable() {
		return null;
	}

}