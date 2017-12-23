package mx.com.thenewtime.e_bitwaretest.model.pojos;

import com.mosso.abi.apptest.R;

import java.util.LinkedList;
import java.util.List;


public class MoreItems {

    private static List<ItemMore> itemMoreList;

    static {
        itemMoreList = new LinkedList<>();

        itemMoreList.add(new ItemMore(R.drawable.tlapaneco1, R.string.mas_1));
        itemMoreList.add(new ItemMore(R.drawable.tlapaneco2, R.string.mas_1));
        itemMoreList.add(new ItemMore(R.drawable.tlapanecos3, R.string.mas_1));
        itemMoreList.add(new ItemMore(R.drawable.tlapanecos4, R.string.mas_1));
        itemMoreList.add(new ItemMore(R.drawable.tlapanecos5, R.string.mas_1));
        itemMoreList.add(new ItemMore(R.drawable.tlapanecos6, R.string.mas_1));
        itemMoreList.add(new ItemMore(R.drawable.tlapanecos7, R.string.mas_1));
    }

    public static List<ItemMore> getItemMoreList() {
        return itemMoreList;
    }

    public static class ItemMore {
        private int Image;
        private int Text;

        private ItemMore(int image, int text) {
            Image = image;
            Text = text;
        }

        public int getImage() {
            return Image;
        }

        public void setImage(int image) {
            Image = image;
        }

        public int getText() {
            return Text;
        }

        public void setText(int text) {
            Text = text;
        }
    }

}
