package com.azore.compustore.fiuady.db;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.azore.compustore.R;
import java.util.List;

/**
 * Created by Armín on 28/03/2017.
 */

public class CategoryListActivity extends AppCompatActivity{




    private class CategoryHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        private TextView txtDescription;
        Context context;
        private  List<CategoryProduct> categoryProducts;

        public CategoryHolder(View itemView, Context context, List<CategoryProduct> categoryProducts){

            super(itemView);
            this.context= context;
            this.categoryProducts= categoryProducts;
            itemView.setOnClickListener(this);
            txtDescription= (TextView) itemView.findViewById(R.id.txt_categories_description)

        }

        public void bindCategories(CategoryProduct categoriesProduct){
            txtDescription.setText(categoriesProduct.getDescription());
        }


        @Override
        public void onClick(View v) {
            int position = getAdapterPosition() ;
            CategoryProduct categoryProduct=this.categoryProducts.get(position);

        }
    }





    private  class CategoriesAdapter extends  RecyclerView.Adapter<CategoryHolder>{
        private List<CategoryProduct> categories_product;
        Context context;

        public CategoriesAdapter(List<CategoryProduct> categories_product, Context context){
            this.categories_product=categories_product;
            this.context=context;
        }

        @Override
        public CategoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = getLayoutInflater().inflate(R.layout.categories_list_item, parent,false);
           return new CategoryHolder(view, context, categories_product);
        }

        @Override
        public void onBindViewHolder(CategoryHolder holder, int position) {
            holder.bindCategories(categories_product.get(position));
        }

        @Override
        public int getItemCount() {
            return categories_product.size();
        }
    }



}

