public class RzeczyAdapter extends ArrayAdapter<Rzeczy> {

    private List<Rzeczy> rzeczyList;
    private Context context;

    public RzeczyAdapter(Context context, List<Rzeczy> rzeczyList) {
        super(context, 0, rzeczyList);
        this.context = context;
        this.rzeczyList = rzeczyList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null) {
            listItem = LayoutInflater.from(context).inflate(R.layout.item_rzecz, parent, false);
        }

        Rzeczy rzecz = rzeczyList.get(position);

        TextView textViewTresc = listItem.findViewById(R.id.textViewTrescZadania);
        textViewTresc.setText(rzecz.getTrescZadania());

        return listItem;
    }
}
