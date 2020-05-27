package vn.edu.ntu.ngodacluong.customlayout.controller;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

import vn.edu.ntu.ngodacluong.customlayout.model.Friend;

public class FriendController extends Application implements IFriendController {
    private List<Friend> friendList = new ArrayList<>();

    public FriendController() {
        friendList.add(new Friend("Thu Cúc", "14/02/1990", "0976324865"));
        friendList.add(new Friend("Thu Thảo", "14/02/1990", "0976324865"));
        friendList.add(new Friend("Thu Đủ", "14/02/1990", "0976324865"));
        friendList.add(new Friend("Thu Tiền", "14/02/1990", "0976324865"));
        friendList.add(new Friend("Nguyễn Y Vân", "14/02/1990", "0976324865"));
        friendList.add(new Friend("Vẫn Y Nguyên", "14/02/1990", "0976324865"));
        friendList.add(new Friend("Vũ Như Cẩn", "14/02/1990", "0976324865"));
        friendList.add(new Friend("Vẫn Như Cũ", "14/02/1990", "0976324865"));
        friendList.add(new Friend("Tôi Thật Hoàng", "14/02/1990", "0976324865"));
        friendList.add(new Friend("Tiền Vô Hạn", "14/02/1990", "0976324865"));
        friendList.add(new Friend("Toán Vô Nghiệm", "14/02/1990", "0976324865"));
    }

    @Override
    public List<Friend> getAllFriend() {
        return this.friendList;
    }
}
