<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FFF6FB">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:paddingTop="20dp"
        android:paddingBottom="20dp">

        <!-- Profile Icon (top right) -->
        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:paddingEnd="16dp">

            <ImageView
                android:id="@+id/profileIcon"
                android:clickable="true"
                android:focusable="true"
                android:layout_width="50dp"
                android:layout_height="50dp"
                android:layout_alignParentEnd="true"
                android:src="@drawable/defaultpfp"
                android:scaleType="centerCrop"
                android:background="@drawable/rounded_background"
                android:padding="4dp"
                android:layout_marginTop="4dp"
                android:layout_marginEnd="4dp" />
        </RelativeLayout>


        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Available Services"
            android:textAlignment="center"
            android:textStyle="bold"
            android:textColor="#333333"
            android:textSize="22sp"
            android:layout_marginTop="8dp"
            android:layout_marginBottom="12dp" />

        <!-- 🔲 Grid of Services -->
        <androidx.recyclerview.widget.RecyclerView
            android:id="@+id/dashboardRecyclerView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginBottom="24dp" />

    </LinearLayout>
</ScrollView>