package vn.edu.ntu.ngodacluong.customlayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import vn.edu.ntu.ngodacluong.customlayout.controller.FriendController;
import vn.edu.ntu.ngodacluong.customlayout.controller.IFriendController;
import vn.edu.ntu.ngodacluong.customlayout.model.Friend;

public class MainActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        IFriendController friendController = (FriendController) getApplication();
        adapter = new Adapter(friendController.getAllFriend());
        recyclerView.setAdapter(adapter);
    }
    private class AdapterViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtDateOfBirth, txtPhoneNumber;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            this.txtName = this.itemView.findViewById(R.id.txtName);
            this.txtDateOfBirth = this.itemView.findViewById(R.id.txtDateOfBirth);
            this.txtPhoneNumber = this.itemView.findViewById(R.id.txtPhoneNumber);
        }
        public void bind (Friend friend) {
            this.txtName.setText(friend.getTxtName());
            this.txtDateOfBirth.setText(friend.getTxtDateOfBirth());
            this.txtPhoneNumber.setText(friend.getTxtPhoneNumber());
        }
    }
    private class Adapter extends RecyclerView.Adapter<AdapterViewHolder> {
        private List<Friend> friendList = new ArrayList<>();
        public Adapter(List<Friend> friendList) {
            this.friendList = friendList;
        }
        @NonNull
        @Override
        public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.list, parent, false);
            return new AdapterViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {
            holder.bind(this.friendList.get(position));
        }

        @Override
        public int getItemCount() {
            return this.friendList.size();
        }
    }
}
