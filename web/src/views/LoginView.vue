<template>

    <v-row justify="center" class="pt-8" style="height: 100%;" align="center">
        <v-col cols=" 12" sm="8" md="6" lg="4">
            <v-card max-width="500" elevation="4">
                <v-card-title class="text-center">登录</v-card-title>
                <v-container>
                    <v-text-field label="用户名" variant="outlined"></v-text-field>
                    <v-text-field label="密码" variant="outlined"></v-text-field>
                </v-container>
                <v-card-actions class="text-center">
                    <v-container>
                        <v-btn class="mx-2">登录</v-btn>
                        <v-btn class="mx-2">注册</v-btn>
                    </v-container>
                </v-card-actions>
            </v-card>
        </v-col>
    </v-row>

</template>