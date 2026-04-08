<?xml version="1.0" encoding="utf-8"?>
<androidx.cardview.widget.CardView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:card_view="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_margin="12dp"
    card_view:cardCornerRadius="16dp"
    card_view:cardElevation="6dp"
    android:background="@android:color/white">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:padding="16dp"
        android:gravity="center_vertical">

        <ImageView
            android:id="@+id/tierImage"
            android:layout_width="70dp"
            android:layout_height="70dp"
            android:layout_marginEnd="16dp"
            android:scaleType="centerCrop"
            android:background="@drawable/rounded_background"
            android:clipToOutline="true"
            android:contentDescription="Tier Icon" />

        <LinearLayout
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:orientation="vertical">

            <TextView
                android:id="@+id/tierName"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Tier Name"
                android:textStyle="bold"
                android:textSize="18sp"
                android:textColor="@android:color/black" />

            <TextView
                android:id="@+id/tierPrice"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="$0.00"
                android:textSize="16sp"
                android:textColor="@android:color/darker_gray" />
        </LinearLayout>

    </LinearLayout>
</androidx.cardview.widget.CardView>