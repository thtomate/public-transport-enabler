/*
 * Copyright 2010 the original author or authors.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.schildbach.pte.live;

import java.util.List;

import org.junit.Test;

import de.schildbach.pte.QueryDeparturesResult;
import de.schildbach.pte.Station;
import de.schildbach.pte.VrrProvider;

/**
 * @author Andreas Schildbach
 */
public class VrrProviderLiveTest
{
	private final VrrProvider provider = new VrrProvider();

	@Test
	public void nearbyStation() throws Exception
	{
		final List<Station> results = provider.nearbyStations("20019904", 0, 0, 0, 0);

		System.out.println(results.size() + "  " + results);
	}

	@Test
	public void departures() throws Exception
	{
		final QueryDeparturesResult result = provider.queryDepartures(provider.departuresQueryUri("1007258", 0));

		System.out.println(result.departures.size() + "  " + result.departures);
	}
}
