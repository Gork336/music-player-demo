<template>
    <v-container>
        <v-row>
            <v-col cols="12">
                <v-card>
                    <v-card-title>音乐播放列表</v-card-title>

                    <v-data-table :headers="headers" :items="plants" height="400" hide-default-footer fixed-header
                        :items-per-page="50">
                        <template v-slot:item.actions="{ item }">
                            <v-btn icon="mdi-play" variant="plain"></v-btn>
                        </template>
                    </v-data-table>
                </v-card>
            </v-col>
        </v-row>
        <v-row>
            <v-card class="ma-2 pa-4">
                <v-row align="center" justify="center">
                    <v-col cols="auto">
                        <v-btn icon="mdi-repeat" variant="plain"></v-btn>
                    </v-col>
                    <v-col cols="auto">
                        <v-btn icon="mdi-repeat-once" variant="plain"></v-btn>
                    </v-col>
                    <v-col cols="auto">
                        <v-btn icon="mdi-shuffle" variant="plain"></v-btn>
                    </v-col>
                    <v-col cols="auto">
                        <v-btn icon="mdi-skip-previous" variant="plain"></v-btn>
                    </v-col>
                    <v-col cols="auto">
                        <v-btn icon="mdi-play" variant="plain"></v-btn>
                    </v-col>
                    <v-col cols="auto">
                        <v-btn icon="mdi-pause" variant="plain"></v-btn>
                    </v-col>
                    <v-col cols="auto">
                        <v-btn icon="mdi-skip-next" variant="plain"></v-btn>
                    </v-col>
                </v-row>
            </v-card>
        </v-row>
    </v-container>
</template>

<script setup lang="ts">
const headers = [
    { title: 'Plant', sortable: false, key: 'name' },
    { title: 'Light', key: 'light', sortable: false },
    { title: 'Height', key: 'height', sortable: false },
    { title: 'Pet Friendly', key: 'petFriendly', sortable: false },
    { title: 'Price ($)', key: 'price', sortable: false },
    { title: 'Actions', key: 'actions', sortable: false },
]

const plants = [
    {
        name: 'Fern',
        light: 'Low',
        height: '20cm',
        petFriendly: 'Yes',
        price: 20,
    },
    {
        name: 'Snake Plant',
        light: 'Low',
        height: '50cm',
        petFriendly: 'No',
        price: 35,
    },
    {
        name: 'Monstera',
        light: 'Medium',
        height: '60cm',
        petFriendly: 'No',
        price: 50,
    },
    {
        name: 'Pothos',
        light: 'Low to medium',
        height: '40cm',
        petFriendly: 'Yes',
        price: 25,
    },
    {
        name: 'ZZ Plant',
        light: 'Low to medium',
        height: '90cm',
        petFriendly: 'Yes',
        price: 30,
    },
    {
        name: 'Spider Plant',
        light: 'Bright, indirect',
        height: '30cm',
        petFriendly: 'Yes',
        price: 15,
    },
    {
        name: 'Air Plant',
        light: 'Bright, indirect',
        height: '15cm',
        petFriendly: 'Yes',
        price: 10,
    },
    {
        name: 'Peperomia',
        light: 'Bright, indirect',
        height: '25cm',
        petFriendly: 'Yes',
        price: 20,
    },
    {
        name: 'Aloe Vera',
        light: 'Bright, direct',
        height: '30cm',
        petFriendly: 'Yes',
        price: 15,
    },
    {
        name: 'Jade Plant',
        light: 'Bright, direct',
        height: '40cm',
        petFriendly: 'Yes',
        price: 25,
    },
]
</script>