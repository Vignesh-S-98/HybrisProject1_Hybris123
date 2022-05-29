/*
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package concerttours.daos;

import java.util.Date;
import java.util.List;

import concerttours.model.NewsModel;


/**
 *
 */
public interface NewsDAO
{

	List<NewsModel> getNewsOfTheDay(Date date);

}
