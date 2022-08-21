package com.company.empl.screen.subdivision;

import io.jmix.ui.screen.*;
import com.company.empl.entity.Subdivision;

@UiController("Subdivision.browse")
@UiDescriptor("subdivision-browse.xml")
@LookupComponent("subdivisionsTable")
public class SubdivisionBrowse extends StandardLookup<Subdivision> {
}