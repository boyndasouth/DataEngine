<?xml version="1.0" encoding="utf-8"?>
<androidx.cardview.widget.CardView xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/serviceCard"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="100dp"
    android:layout_marginVertical="6dp"
    android:layout_marginHorizontal="24dp"
    app:cardCornerRadius="18dp"
    app:cardElevation="5dp">

    <FrameLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_gravity="center">

        <ImageView
            android:id="@+id/serviceImage"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_margin="6dp"
            android:scaleType="centerCrop"
            android:background="@drawable/rounded_background"
            android:clipToOutline="true"
            android:contentDescription="Subscription Service" />
    </FrameLayout>
</androidx.cardview.widget.CardView>