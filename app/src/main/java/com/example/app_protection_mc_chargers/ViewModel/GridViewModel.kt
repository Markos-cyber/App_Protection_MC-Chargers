package com.example.app_protection_mc_chargers.ViewModel

import androidx.lifecycle.ViewModel
import com.example.app_protection_mc_chargers.R
import com.example.app_protection_mc_chargers.data.GridItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class GridViewModel : ViewModel() {
    private val _gridItems = MutableStateFlow<List<GridItem>>(emptyList())
    val gridItems: StateFlow<List<GridItem>> get() = _gridItems

    init {
        loadGridItems()
    }

    private fun loadGridItems() {
        // Fetch items from a repository
        _gridItems.value = listOf(
            GridItem(id = "1", title = "Item 1", imageRes = R.drawable.mcchargers_22),
            GridItem(id = "2", title = "Item 2", imageRes = R.drawable.orion_midi_g__1_),
            // ...
        )
    }
}
