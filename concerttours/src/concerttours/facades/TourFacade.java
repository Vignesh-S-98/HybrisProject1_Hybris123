/*
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package concerttours.facades;

import concerttours.data.TourData;


/**
 *
 */
public interface TourFacade
{

	TourData getTourDetails(final String tourId);

}
