package com.rareprob.core_pulgin.payment.in_app_purchase.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001f B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00182\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0016H\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006!"}, d2 = {"Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/InAppPurchaseAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/InAppPurchaseAdapter$MyViewHolder;", "mListner", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/InAppPurchaseAdapter$OnItemClickListener;", "dataList", "", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/data/model/ProductListingData;", "(Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/InAppPurchaseAdapter$OnItemClickListener;Ljava/util/List;)V", "getMListner", "()Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/InAppPurchaseAdapter$OnItemClickListener;", "setMListner", "(Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/InAppPurchaseAdapter$OnItemClickListener;)V", "productStatusMap", "", "", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/data/model/InAppProductData;", "getProductStatusMap", "()Ljava/util/Map;", "setProductStatusMap", "(Ljava/util/Map;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MyViewHolder", "OnItemClickListener", "core-pulgin_debug"})
public final class InAppPurchaseAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.rareprob.core_pulgin.payment.in_app_purchase.presentation.InAppPurchaseAdapter.MyViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private com.rareprob.core_pulgin.payment.in_app_purchase.presentation.InAppPurchaseAdapter.OnItemClickListener mListner;
    private java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData> dataList;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, com.rareprob.core_pulgin.payment.in_app_purchase.data.model.InAppProductData> productStatusMap;
    
    public InAppPurchaseAdapter(@org.jetbrains.annotations.Nullable()
    com.rareprob.core_pulgin.payment.in_app_purchase.presentation.InAppPurchaseAdapter.OnItemClickListener mListner, @org.jetbrains.annotations.NotNull()
    java.util.List<com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData> dataList) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.rareprob.core_pulgin.payment.in_app_purchase.presentation.InAppPurchaseAdapter.OnItemClickListener getMListner() {
        return null;
    }
    
    public final void setMListner(@org.jetbrains.annotations.Nullable()
    com.rareprob.core_pulgin.payment.in_app_purchase.presentation.InAppPurchaseAdapter.OnItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.rareprob.core_pulgin.payment.in_app_purchase.data.model.InAppProductData> getProductStatusMap() {
        return null;
    }
    
    public final void setProductStatusMap(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.rareprob.core_pulgin.payment.in_app_purchase.data.model.InAppProductData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    @java.lang.Override()
    public com.rareprob.core_pulgin.payment.in_app_purchase.presentation.InAppPurchaseAdapter.MyViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.rareprob.core_pulgin.payment.in_app_purchase.presentation.InAppPurchaseAdapter.MyViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/InAppPurchaseAdapter$OnItemClickListener;", "", "onitemClick", "", "pack", "", "position", "", "subType", "item", "Lcom/rareprob/core_pulgin/payment/in_app_purchase/data/model/ProductListingData;", "core-pulgin_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onitemClick(@org.jetbrains.annotations.NotNull()
        java.lang.String pack, int position, @org.jetbrains.annotations.NotNull()
        java.lang.String subType, @org.jetbrains.annotations.Nullable()
        com.rareprob.core_pulgin.payment.in_app_purchase.data.model.ProductListingData item);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/InAppPurchaseAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/rareprob/core_pulgin/payment/in_app_purchase/presentation/InAppPurchaseAdapter;Landroid/view/View;)V", "itemTextView", "Landroid/widget/TextView;", "getItemTextView", "()Landroid/widget/TextView;", "setItemTextView", "(Landroid/widget/TextView;)V", "tvProductStatus", "getTvProductStatus", "setTvProductStatus", "core-pulgin_debug"})
    public final class MyViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView itemTextView;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvProductStatus;
        
        public MyViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getItemTextView() {
            return null;
        }
        
        public final void setItemTextView(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvProductStatus() {
            return null;
        }
        
        public final void setTvProductStatus(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
    }
}