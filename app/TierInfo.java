<?xml version="1.0" encoding="utf-8"?>
<androidx.cardview.widget.CardView xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/serviceCard"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="100dp"
    android:layout_marginVertical="8dp"
    android:layout_marginHorizontal="24dp"
    app:cardCornerRadius="20dp"
    app:cardElevation="6dp">

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center">

        <ImageView
            android:id="@+id/serviceImage"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_margin="10dp"
            android:scaleType="centerCrop"
            android:clipToOutline="true"
            android:background="@drawable/rounded_background"
            android:contentDescription="Service Icon"/>
    </FrameLayout>
</androidx.cardview.widget.CardView>