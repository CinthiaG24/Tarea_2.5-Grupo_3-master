package tu.paquete.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import tu.paquete.model.Registro;
import tu.paquete.R;

public class RegistroAdapter extends RecyclerView.Adapter<RegistroAdapter.ViewHolder> {
    private List<Registro> listaRegistros;

    public RegistroAdapter(List<Registro> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvFecha, tvHora;

        public ViewHolder(View itemView) {
            super(itemView);
            tvFecha = itemView.findViewById(R.id.tvFecha);
            tvHora = itemView.findViewById(R.id.tvHora);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Registro registro = listaRegistros.get(position);
        holder.tvFecha.setText(registro.getFecha());
        holder.tvHora.setText(registro.getHora());
    }

    @Override
    public int getItemCount() {
        return listaRegistros.size();
    }
}
