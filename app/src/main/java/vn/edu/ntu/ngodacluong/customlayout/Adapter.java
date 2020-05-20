package vn.edu.ntu.ngodacluong.customlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHoder>
{
    List<Model> list;
    Context context;

    public Adapter(List<Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        return new ViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHoder holder, int position)
    {
        Model model = list.get(position);
        holder.txtName.setText(model.getTxtName());
        holder.txtDateOfBirth.setText(model.getTxtDateOfBirth());
        holder.txtPhoneNumber.setText(model.getTxtPhoneNumber());

    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }
    public class ViewHoder extends RecyclerView.ViewHolder
    {
        TextView txtName, txtDateOfBirth, txtPhoneNumber;
        public ViewHoder(@NonNull View itemView)
        {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtDateOfBirth = itemView.findViewById(R.id.txtDateOfBirth);
            txtPhoneNumber = itemView.findViewById(R.id.txtPhoneNumber);
        }
    }

}
