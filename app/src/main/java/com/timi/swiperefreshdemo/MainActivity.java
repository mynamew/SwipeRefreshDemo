package com.timi.swiperefreshdemo;


import com.timi.bottomnavigationview.BottomNavigationItem;
import com.timi.bottomnavigationview.BottomNavigationView;
import com.timi.bottomnavigationview.OnBottomNavigationItemClickListener;
import com.timi.swiperefreshdemo.base.BaseActivity;

public class MainActivity extends BaseActivity {
    private BottomNavigationView bottomNavigationView;
    int[] image = {R.drawable.ic_home, R.drawable.ic_favorite_black_24dp,
            R.drawable.ic_book_black_24dp, R.drawable.ic_user};

    @Override
    public int setLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        int[] color = {getResources().getColor(R.color.firstColor), getResources().getColor(R.color.secondColor),
                getResources().getColor(R.color.thirdColor), getResources().getColor(R.color.fourthColor)};
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.home_bottomNavigation);
        if (bottomNavigationView != null) {
            bottomNavigationView.isWithText(false);
            // bottomNavigationView.activateTabletMode();
            bottomNavigationView.isColoredBackground(true);
            bottomNavigationView.setTextActiveSize(getResources().getDimension(R.dimen.text_active));
            bottomNavigationView.setTextInactiveSize(getResources().getDimension(R.dimen.text_inactive));
            bottomNavigationView.setItemActiveColorWithoutColoredBackground(getResources().getColor(R.color.firstColor));
        }

        BottomNavigationItem bottomNavigationItem = new BottomNavigationItem
                ("主页", color[0], image[0]);
        BottomNavigationItem bottomNavigationItem1 = new BottomNavigationItem
                ("收藏", color[1], image[1]);
        BottomNavigationItem bottomNavigationItem2 = new BottomNavigationItem
                ("发现", color[2], image[2]);
        BottomNavigationItem bottomNavigationItem3 = new BottomNavigationItem
                ("我的", color[3], image[3]);


        bottomNavigationView.addTab(bottomNavigationItem);
        bottomNavigationView.addTab(bottomNavigationItem1);
        bottomNavigationView.addTab(bottomNavigationItem2);
        bottomNavigationView.addTab(bottomNavigationItem3);

        bottomNavigationView.setOnBottomNavigationItemClickListener(new OnBottomNavigationItemClickListener() {
            @Override
            public void onNavigationItemClick(int index) {
                switch (index) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            }
        });

    }

}
