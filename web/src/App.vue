<template>
  <v-app>

    <v-app-bar title="Music Player" class="border-b-thin">
      <v-btn to="/login">login </v-btn>
    </v-app-bar>

    <v-navigation-drawer v-if="route.path !== '/login'">
      <v-list>
        <v-list-item link to="/playlist" title="播放列表"></v-list-item>
        <v-list-item link title="1"></v-list-item>
        <v-list-item link title="/test"></v-list-item>
      </v-list>
    </v-navigation-drawer>

    <v-main>
      <v-container fluid style="height: 100%;">
        <RouterView></RouterView>
      </v-container>
    </v-main>

  </v-app>



</template>
<script setup>
import { useRoute } from 'vue-router'
const route = useRoute()
</script>