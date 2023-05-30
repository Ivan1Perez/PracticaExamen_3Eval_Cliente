package es.ieslavereda.practicaexamen_3eval_cliente;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {

    private FruitRepository repository;
    private List<Fruit> fruits;
    private final LayoutInflater inflater;

    public MyRecyclerViewAdapter(Context context) {
        repository = FruitRepository.getInstance();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.simple_element,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Fruit f = repository.getFruit(position);

        holder.frutaTView.setText(f.getName());
        holder.priceTView.setText(f.getPrice());
        holder.imageView.setImageResource(f.getImage());
        holder.saleDayTView.setText(f.getSaleDay());
    }

    @Override
    public int getItemCount() {
        return repository.getSize();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView frutaTView;
        private TextView priceTView;
        private TextView saleDayTView;
        private ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            frutaTView = itemView.findViewById(R.id.frutaTView);
            priceTView = itemView.findViewById(R.id.priceTView);
            saleDayTView = itemView.findViewById(R.id.saleDayTView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
