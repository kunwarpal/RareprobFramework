package com.rareprob.core_pulgin.payment.in_app_purchase.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.rareprob.core_pulgin.R
import com.rareprob.core_pulgin.payment.in_app_purchase.data.model.InAppProductData
import com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData

 class InAppPurchaseAdapter(
     var mListner: OnItemClickListener?,
     private var dataList: List<ProductListingData>

) :
    RecyclerView.Adapter<InAppPurchaseAdapter.MyViewHolder>() {

    var productStatusMap: Map<String, InAppProductData> = emptyMap()
//    fun setProductStatusMap(productStatusMap: Map<String, InAppProductData>) {
//        this.productStatusMap = productStatusMap
//    }


    interface OnItemClickListener {
        fun onitemClick(pack: String, position: Int, subType: String, item: ProductListingData?)
    }

    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var itemTextView: TextView = view.findViewById(R.id.itemTextView)
        var tvProductStatus: TextView = view.findViewById(R.id.tvProductStatus)
    }

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_in_app_purchase_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val iapItem = dataList[position]
        holder.itemTextView.text = iapItem.toString()

        var productStatus = productStatusMap[iapItem.productID]
        holder.tvProductStatus.text =
            if (productStatus?.isPurchased == true) "Product already purchased by you (Restored)" else "Buy product"



        holder.itemTextView.setOnClickListener {
            mListner?.onitemClick(
                iapItem.packId ?: "",
                position,
                iapItem.subType ?: "",
                dataList[position]
            )
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}