package co.applabltd.musicplayerbd.Adapter;

import android.content.Context;
import android.graphics.Movie;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import co.applabltd.musicplayerbd.Model.SongsList;
import co.applabltd.musicplayerbd.R;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<SongsList> implements Filterable{

    private Context mContext;
    private ArrayList<SongsList> songList = new ArrayList<>();

    public SongAdapter(Context mContext, ArrayList<SongsList> songList) {
        super(mContext, 0, songList);
        this.mContext = mContext;
        this.songList = songList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(R.layout.playlist_items, parent, false);
        }
        SongsList currentSong = songList.get(position);
        TextView tvTitle = listItem.findViewById(R.id.tv_music_name);
        TextView tvSubtitle = listItem.findViewById(R.id.tv_music_subtitle);
        tvTitle.setText(currentSong.getTitle());
        tvSubtitle.setText(currentSong.getSubTitle());
        return listItem;
    }
}
