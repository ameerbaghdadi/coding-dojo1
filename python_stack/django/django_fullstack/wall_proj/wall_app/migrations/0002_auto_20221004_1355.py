# Generated by Django 2.2.4 on 2022-10-04 10:55

from django.db import migrations


class Migration(migrations.Migration):

    dependencies = [
        ('wall_app', '0001_initial'),
    ]

    operations = [
        migrations.RenameField(
            model_name='comment',
            old_name='messages',
            new_name='message',
        ),
        migrations.RenameField(
            model_name='comment',
            old_name='users',
            new_name='user',
        ),
        migrations.RenameField(
            model_name='message',
            old_name='users',
            new_name='user',
        ),
    ]
