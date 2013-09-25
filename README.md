standardlist
============

standard list module 




public View getView(int position, View convertView, ViewGroup parent){
	
	// A ViewHolder keeps references to children views to avoid unnecessary
	// calls to findViewById() on each row.
	ViewHolder holder;

	// When convertView is not null, we can reuse it directly, there is no
	// need to reinflate it. We only inflate a new View when the convertView
	// supplied by ListView is null.
	if (convertView == null) {
		convertView = mInflater.inflate(R.layout.YOUR_ITEM, null);

		// Creates a ViewHolder and store references to the two children
		// views we want to bind data to.
		holder = new ViewHolder();
		holder.YOUR_HOLDER_MEMBER = convertView.findViewById(R.id.YOUR_ITEM_ID);

		convertView.setTag(holder);
	} else {
		// Get the ViewHolder back to get fast access to the TextView
		// and the ImageView.
		holder = (ViewHolder) convertView.getTag();
	}

	// Bind the data efficiently with the holder.
	holder.YOUR_HOLDER_MEMBER.setText(YOUR_WORDS);
	return convertView;
}

