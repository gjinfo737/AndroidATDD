package com.cukeshow.mycookbook.data;

import java.util.ArrayList;
import java.util.List;

import com.aj.androidatdd.R.drawable;
import com.aj.androidatdd.R.id;
import com.aj.androidatdd.R.layout;
import com.cukeshow.mycookbook.selectables.CookAndServingStep;
import com.cukeshow.mycookbook.selectables.Ingredient;
import com.cukeshow.mycookbook.selectables.PreparatationStep;
import com.cukeshow.mycookbook.selectables.Recipe;
import com.cukeshow.mycookbook.selectables.ThingsToDo;
import com.cukeshow.mycookbook.selectables.lists.CookingAndServingStepsList;
import com.cukeshow.mycookbook.selectables.lists.IngredientsList;
import com.cukeshow.mycookbook.selectables.lists.PreparationStepsList;

public class Commons {
	public static final String PREPARATION_STEPS = "Preparation Steps";
	public static final String INGREDIENTS = "Ingredients";
	public static final String COOKING_AND_SERVING = "Cooking and Serving";
	public static final int BOD_RADIUS_DEFAULT = layout.bod_radius_default;
	public static final int BODACIOUS_LISTVIEW_ID = id.bodacious_listView;
	public static final int RADIUS_ITEM_BODACIOUS = id.bod_radius_item_bodacious;
	public static final int RADIUS_SUB_LAYOUT_ID = id.sub_rellay;
	public static final int RADIUS_ITEM_CONTAINER_ID = id.bod_radius_item_container;
	public static final int[] RADIUS_LAYOUTS = new int[] { layout.bod_radius_0, layout.bod_radius_1, layout.bod_radius_2, layout.bod_radius_3, layout.bod_radius_4,
			layout.bod_radius_5, layout.bod_radius_6, layout.bod_radius_7, layout.bod_radius_8,

	};
	public static final int[] RADIUS_LAYOUT_ITEM_IDS = new int[] { id.bod_radius_item_0, id.bod_radius_item_1, id.bod_radius_item_2, id.bod_radius_item_3, id.bod_radius_item_4,
			id.bod_radius_item_5, id.bod_radius_item_6, id.bod_radius_item_7, id.bod_radius_item_8, };
	public static final List<List<Ingredient>> ingredients = new ArrayList<List<Ingredient>>() {
		{
			add(new ArrayList<Ingredient>() {
				{
					// cucumber and onions
					add(new Ingredient("Cucumbers", "x1", drawable.cucumberwhole, null));
					add(new Ingredient("White Onion", "x1", drawable.whiteonionwhole, null));
					add(new Ingredient("Cups of\nwhite vinegar", "x2", drawable.whitevinegarbottle, null));
					add(new Ingredient("Cups of\nsalt", "x1/2", drawable.saltinbowl, null));
					add(new Ingredient("Cups of\nwater", "x3", drawable.waterpouring, null));
					add(new Ingredient("A Container", "At least 2 quarts", drawable.twoqrtcontainer, null));
				}
			});
			add(new ArrayList<Ingredient>() {
				{
					// beef stew
					add(new Ingredient("0", "", drawable.ic_launcher, null));
					add(new Ingredient("1", "", drawable.ic_launcher, null));
					add(new Ingredient("2", "", drawable.ic_launcher, null));
					add(new Ingredient("3", "", drawable.ic_launcher, null));
					add(new Ingredient("4", "", drawable.ic_launcher, null));
					add(new Ingredient("5", "", drawable.ic_launcher, null));
				}
			});
			add(new ArrayList<Ingredient>() {
				{
					// fruit parfait
					add(new Ingredient("0", "", drawable.ic_launcher, null));
					add(new Ingredient("1", "", drawable.ic_launcher, null));
					add(new Ingredient("2", "", drawable.ic_launcher, null));
				}
			});

		}
	};
	public static final List<List<PreparatationStep>> prepSteps = new ArrayList<List<PreparatationStep>>() {
		{
			add(new ArrayList<PreparatationStep>() {
				{
					// cucumber and onions
					add(new PreparatationStep("Cut the onion\ninto 1/4\" cubes", "1", drawable.whiteonionsdiced, null));
					add(new PreparatationStep("Slice and peel\nthe cucumbers", "2", drawable.peeledcucumberslicesbowl, null));
					add(new PreparatationStep("Add the cucumbers\nto the container", "3", drawable.ic_launcher, null));
					add(new PreparatationStep("Add the onion\nto the container", "4", drawable.ic_launcher, null));
					add(new PreparatationStep("Add the salt\nto the container", "5", drawable.ic_launcher, null));
					add(new PreparatationStep("Add the vinegar\nto the container", "6", drawable.ic_launcher, null));
					add(new PreparatationStep("Add the water\nto the container", "7", drawable.ic_launcher, null));
				}
			});
			add(new ArrayList<PreparatationStep>() {
				{
					add(new PreparatationStep("0b", "", drawable.ic_launcher, null));
					add(new PreparatationStep("1", "", drawable.ic_launcher, null));
				}
			});
			add(new ArrayList<PreparatationStep>() {
				{
					add(new PreparatationStep("0c", "", drawable.ic_launcher, null));
					add(new PreparatationStep("1", "", drawable.ic_launcher, null));
				}
			});

		}
	};
	public static final List<List<CookAndServingStep>> cookAndServeSteps = new ArrayList<List<CookAndServingStep>>() {
		{
			add(new ArrayList<CookAndServingStep>() {
				{
					// cucumber and onions
					add(new CookAndServingStep("1", "Stir slightly\nthen cover", drawable.ic_launcher, null));
					add(new CookAndServingStep("2", "Put it in the\nfridge over night", drawable.ic_launcher, null));
					add(new CookAndServingStep("2", "Serve plain\nor on a salad", drawable.ic_launcher, null));
				}
			});
			add(new ArrayList<CookAndServingStep>() {
				{
					add(new CookAndServingStep("0b", "", drawable.ic_launcher, null));
					add(new CookAndServingStep("1", "", drawable.ic_launcher, null));
				}
			});
			add(new ArrayList<CookAndServingStep>() {
				{
					add(new CookAndServingStep("0c", "", drawable.ic_launcher, null));
					add(new CookAndServingStep("1", "", drawable.ic_launcher, null));
				}
			});

		}
	};
	public static final List<List<ThingsToDo>> thingsToDo = new ArrayList<List<ThingsToDo>>() {
		{
			add(new ArrayList<ThingsToDo>() {
				{
					// cucumber and onions
					add(new IngredientsList(drawable.ic_launcher, null, ingredients.get(0)));
					add(new PreparationStepsList(drawable.ic_launcher, null, prepSteps.get(0)));
					add(new CookingAndServingStepsList(drawable.ic_launcher, null, cookAndServeSteps.get(0)));
				}
			});
			add(new ArrayList<ThingsToDo>() {
				{
					// beef stew
					add(new IngredientsList(drawable.ic_launcher, null, ingredients.get(1)));
					add(new PreparationStepsList(drawable.ic_launcher, null, prepSteps.get(1)));
					add(new CookingAndServingStepsList(drawable.ic_launcher, null, cookAndServeSteps.get(1)));
				}
			});
			add(new ArrayList<ThingsToDo>() {
				{
					// fruit parfait
					add(new IngredientsList(drawable.ic_launcher, null, ingredients.get(2)));
					add(new PreparationStepsList(drawable.ic_launcher, null, prepSteps.get(2)));
					add(new CookingAndServingStepsList(drawable.ic_launcher, null, cookAndServeSteps.get(2)));
				}
			});

		}
	};

	@SuppressWarnings("serial")
	public static final List<Recipe> recipes = new ArrayList<Recipe>() {
		{
			add(new Recipe("Cucumber and Onions", "Healthy Snacks", drawable.ic_launcher, null, thingsToDo.get(0)));
			add(new Recipe("Beef Stew", "Hearty Meals", drawable.ic_launcher, null, thingsToDo.get(1)));
			add(new Recipe("Fruit Parfait", "Healthy Desserts", drawable.ic_launcher, null, thingsToDo.get(2)));
		}
	};
}
