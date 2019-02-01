"""
Base URL configuration for POSsibility

@author Matthew Scott
@version $Id: urls.py 9 2010-04-02 07:37:39Z matthew.joseph.scott $
"""

from django.conf.urls.defaults import *

from django.contrib import admin
admin.autodiscover()

urlpatterns = patterns('',
    (r'^', include('possibility.POS.urls')),

    # Uncomment the admin/doc line below and add 'django.contrib.admindocs' 
    # to INSTALLED_APPS to enable admin documentation:
    # (r'^admin/doc/', include('django.contrib.admindocs.urls')),

    (r'^admin/', include(admin.site.urls)),
)
