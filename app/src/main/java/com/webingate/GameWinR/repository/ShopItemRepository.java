package com.webingate.GameWinR.repository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.webingate.GameWinR.object.ShopItem;

import java.util.ArrayList;

/**
 * Created by Panacea-Soft on 6/7/18.
 * Contact Email : teamps.is.cool@gmail.com
 */


public class ShopItemRepository {

    public static ShopItem getWomenShopItem() {

        ArrayList<ShopItem> tmpArrayList = new Gson().fromJson(jsonWomenItems, new TypeToken<ArrayList<ShopItem>>() {
        }.getType());

        return tmpArrayList.get(0);
    }

    public static ArrayList<ShopItem> getWomenShopItemList() {
        return new Gson().fromJson(jsonWomenItems, new TypeToken<ArrayList<ShopItem>>() {}.getType());
    }

    public static ArrayList<ShopItem> getMenShopItemList() {
        return new Gson().fromJson(jsonMenItems, new TypeToken<ArrayList<ShopItem>>() {}.getType());
    }

    public static ArrayList<ShopItem> getKidShopItemList() {
        return new Gson().fromJson(jsonKidItems, new TypeToken<ArrayList<ShopItem>>() {}.getType());
    }


    static String jsonWomenItems = "\n" +
            "[\n" +
            "  {\n" +
            "    \"id\":\"Women\",\n" +
            "    \"name\":\"Warframe\",\n" +
            "    \"image\":\"game1\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"250\",\n" +
            "    \"category_name\":\"Bouquets\",\n" +
            "    \"rating_count\":\"45\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"0\",\n" +
            "    \"is_liked\":\"true\",\n" +
            "    \"description\":\"The rose is a type of flowering shrub. Its name comes from the Latin word Rosa. The flowers of the rose grow in many different colors, from the well-known red rose or yellow roses and sometimes white or purple roses. Roses belong to the family of plants called Rosaceae.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"boquet1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet3\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet4\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet5\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet6\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"3000\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Women\",\n" +
            "    \"name\":\"DOTA 2\",\n" +
            "    \"image\":\"game2\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Bouquets\",\n" +
            "    \"rating_count\":\"34\",\n" +
            "    \"total_rating\":\"5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"The rose is a type of flowering shrub. Its name comes from the Latin word Rosa. The flowers of the rose grow in many different colors, from the well-known red rose or yellow roses and sometimes white or purple roses. Roses belong to the family of plants called Rosaceae.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet3\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet4\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"2500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Women\",\n" +
            "    \"name\":\"Tom Clancy's Rainbow Six Siegev\",\n" +
            "    \"image\":\"game3\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Bouquets\",\n" +
            "    \"rating_count\":\"500\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"The rose is a type of flowering shrub. Its name comes from the Latin word Rosa. The flowers of the rose grow in many different colors, from the well-known red rose or yellow roses and sometimes white or purple roses. Roses belong to the family of plants called Rosaceae.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet3\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet4\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet5\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"3330\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Women\",\n" +
            "    \"name\":\"The Elder Scrolls Online\",\n" +
            "    \"image\":\"game4\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Bouquets\",\n" +
            "    \"total_rating\":\"5\",\n" +
            "    \"rating_count\":\"55\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"true\",\n" +
            "    \"description\":\"The rose is a type of flowering shrub. Its name comes from the Latin word Rosa. The flowers of the rose grow in many different colors, from the well-known red rose or yellow roses and sometimes white or purple roses. Roses belong to the family of plants called Rosaceae.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet4\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet5\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet6\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"1002\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Women\",\n" +
            "    \"name\":\"Assassin's Creed Odyssey\",\n" +
            "    \"image\":\"game5\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Bouquets\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"rating_count\":\"50\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"The rose is a type of flowering shrub. Its name comes from the Latin word Rosa. The flowers of the rose grow in many different colors, from the well-known red rose or yellow roses and sometimes white or purple roses. Roses belong to the family of plants called Rosaceae.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet6\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"2500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Women\",\n" +
            "    \"name\":\"PlayerUnknown's Battlegrounds\",\n" +
            "    \"image\":\"game6\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Bouquets\",\n" +
            "    \"total_rating\":\"3\",\n" +
            "    \"rating_count\":\"33\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"The rose is a type of flowering shrub. Its name comes from the Latin word Rosa. The flowers of the rose grow in many different colors, from the well-known red rose or yellow roses and sometimes white or purple roses. Roses belong to the family of plants called Rosaceae.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet3\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"bouquet4\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"500\"\n" +
            "  }\n" +
            "]\n";


    static String jsonMenItems = "[\n" +
            "  {\n" +
            "    \"id\":\"Men\",\n" +
            "    \"name\":\"All too easy tee\",\n" +
            "    \"image\":\"men_cloth_1\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"45\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"true\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"3500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Men\",\n" +
            "    \"name\":\"America loves texas tee\",\n" +
            "    \"image\":\"men_cloth_2\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"50\",\n" +
            "    \"total_rating\":\"5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"2500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Men\",\n" +
            "    \"name\":\"Angler fleece pullover\",\n" +
            "    \"image\":\"men_cloth_3\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"450\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"1500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Men\",\n" +
            "    \"name\":\"Austin city limits track tee\",\n" +
            "    \"image\":\"men_cloth_4\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"50\",\n" +
            "    \"total_rating\":\"5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"2300\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Men\",\n" +
            "    \"name\":\"Backpack bear long tee\",\n" +
            "    \"image\":\"men_cloth_5\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"33\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"true\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"2500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Men\",\n" +
            "    \"name\":\"Bermuda Polo\",\n" +
            "    \"image\":\"men_cloth_6\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"25\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"true\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"men_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"4500\"\n" +
            "  }\n" +
            "]\n";


    static String jsonKidItems = "[\n" +
            "  {\n" +
            "    \"id\":\"Kid\",\n" +
            "    \"name\":\"Infant plushee bear hoodie\",\n" +
            "    \"image\":\"kid_cloth_1\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"88\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"true\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "        \"shop_name\":\"Nike\",\n" +
            "        \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "        \"shop_phone\":\"+957777777\",\n" +
            "        \"shop_website\":\"www.panacea-soft.com\",\n" +
            "        \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "      },\n" +
            "    \"view_count\":\"2500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Kid\",\n" +
            "    \"name\":\"Sxsw taco truck toddler tee\",\n" +
            "    \"image\":\"kid_cloth_2\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"35\",\n" +
            "    \"total_rating\":\"5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"3000\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Kid\",\n" +
            "    \"name\":\"toddlers' synchilla fleece vest\",\n" +
            "    \"image\":\"kid_cloth_3\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"64\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"true\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"2500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Kid\",\n" +
            "    \"name\":\"Toddlers' long sleeve - Austin\",\n" +
            "    \"image\":\"kid_cloth_4\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"55\",\n" +
            "    \"total_rating\":\"5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"3500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Kid\",\n" +
            "    \"name\":\"Infant oso hoodie\",\n" +
            "    \"image\":\"kid_cloth_5\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"33\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"500\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\":\"Kid\",\n" +
            "    \"name\":\"Tooddler tcu arch tee\",\n" +
            "    \"image\":\"kid_cloth_6\",\n" +
            "    \"currency\":\"$\",\n" +
            "    \"price\":\"200\",\n" +
            "    \"original_price\":\"240\",\n" +
            "    \"category_name\":\"Clothing\",\n" +
            "    \"rating_count\":\"47\",\n" +
            "    \"total_rating\":\"4.5\",\n" +
            "    \"discount\":\"20\",\n" +
            "    \"is_liked\":\"false\",\n" +
            "    \"description\":\"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc sed tellus orci.\",\n" +
            "    \"image_list\":[\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_1\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_2\"\n" +
            "      },\n" +
            "      {\n" +
            "        \"image_name\":\"kid_cloth_3\"\n" +
            "      }\n" +
            "    ],\n" +
            "    \"shop\" : {\n" +
            "      \"shop_name\":\"Nike\",\n" +
            "      \"shop_email\":\"teamps.is.cool@gmail.com\",\n" +
            "      \"shop_phone\":\"+957777777\",\n" +
            "      \"shop_website\":\"www.panacea-soft.com\",\n" +
            "      \"shop_address\":\"Alkida'a Street , Ghamdhan balding, First floor\"\n" +
            "    },\n" +
            "    \"view_count\":\"4000\"\n" +
            "  }\n" +
            "]";
}

